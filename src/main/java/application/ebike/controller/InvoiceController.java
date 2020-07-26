package application.ebike.controller;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.ebike.dto.ApparelOrderDTO;
import application.ebike.dto.BikeOrderDTO;
import application.ebike.dto.EmailDTO;
import application.ebike.dto.InvoiceDTO;
import application.ebike.model.Apparel;
import application.ebike.model.ApparelOrderItem;
import application.ebike.model.Bike;
import application.ebike.model.BikeOrderItem;
import application.ebike.model.Invoice;
import application.ebike.service.EmailSerivce;
import application.ebike.service.InvoiceService;
import application.ebike.service.InvoiceStatusService;

@RestController
@RequestMapping(value = "api/v1.0/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private EmailSerivce emailService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private InvoiceStatusService invoiceStatusService;

    @PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE })
    public InvoiceDTO saveInvoice(@RequestBody InvoiceDTO invoiceDTO) {
        Invoice invoice = invoiceService.saveInvoice(convertInvoiceDTOToModel(invoiceDTO));
        if (!Objects.isNull(invoice.getId())) {
            emailService.sendMail(parseToEmailDTO(invoiceDTO));
        }

        return convertInvoiceToDTO(invoice);
    }

    @GetMapping(value = "/history")
    public Collection<InvoiceDTO> getInvoicesByUserId(@RequestParam(name = "uid") String userId) {

        return invoiceService.getInvoicesByUserId(userId).stream().map(this::converInvoiceToDTOForHistory)
                .collect(Collectors.toList());
    }

    private Invoice convertInvoiceDTOToModel(InvoiceDTO invoiceDTO) {
        Invoice invoice = modelMapper.map(invoiceDTO, Invoice.class);
        invoice.setStatus(invoiceStatusService.getInitStatus());
        invoice.setBikes(invoiceDTO.getBikes().stream()
                .map(bike -> BikeOrderItem.builder().invoice(invoice)
                        .bike(Bike.builder().id(bike.getId()).name(bike.getName()).build()).quantity(bike.getQuantity())
                        .build())
                .collect(Collectors.toList()));
        invoice.setApparels(invoiceDTO.getApparels().stream()
                .map(apparel -> ApparelOrderItem.builder().invoice(invoice)
                        .apparel(Apparel.builder().id(apparel.getId()).name(apparel.getName()).build())
                        .quantity(apparel.getQuantity()).build())
                .collect(Collectors.toList()));
        invoice.setOrderDate(LocalDate.now());

        return invoice;
    }

    private InvoiceDTO convertInvoiceToDTO(Invoice invoice) {

        return modelMapper.map(invoice, InvoiceDTO.class);
    }

    private InvoiceDTO converInvoiceToDTOForHistory(Invoice invoice) {
        var invoiceDTO = convertInvoiceToDTO(invoice);
        invoiceDTO.setStatus(invoice.getStatus().getValue());
        invoiceDTO.setBikes(invoice.getBikes().stream().map(bike -> {
            var bikeOrder = modelMapper.map(bike, BikeOrderDTO.class);
            bikeOrder.setImageUrl(bike.getBike().getImageUrl());
            bikeOrder.setName(bike.getBike().getName());
            bikeOrder.setPrice(bike.getBike().getPrice());

            return bikeOrder;
        }).collect(Collectors.toList()));

        invoiceDTO.setApparels(invoice.getApparels().stream().map(apparel -> {
            var apparelOrder = modelMapper.map(apparel, ApparelOrderDTO.class);
            apparelOrder.setImageUrl(apparel.getApparel().getImageUrl());
            apparelOrder.setName(apparel.getApparel().getName());
            apparelOrder.setPrice(apparel.getApparel().getPrice());

            return apparelOrder;
        }).collect(Collectors.toList()));

        return invoiceDTO;
    }

    private EmailDTO parseToEmailDTO(InvoiceDTO invoice) {
        EmailDTO email = new EmailDTO();
        email.setTo(invoice.getCustomerEmail());
        email.setSubject("Sondors Order confirmation");
        Map<String, Object> templateData = new HashMap<>();
        templateData.put("name", invoice.getCustomerName());
        templateData.put("bikes", invoice.getBikes());
        templateData.put("apparels", invoice.getApparels());
        templateData.put("address", invoice.getCustomerAddress());
        templateData.put("phone", invoice.getPhone());
        templateData.put("email", invoice.getCustomerEmail());
        templateData.put("total", invoice.getTotal());
        email.setData(templateData);

        return email;
    }
}