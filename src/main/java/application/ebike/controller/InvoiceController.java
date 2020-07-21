package application.ebike.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.ebike.dto.EmailDTO;
import application.ebike.dto.InvoiceDTO;
import application.ebike.model.Bike;
import application.ebike.model.BikeOrderItem;
import application.ebike.model.Invoice;
import application.ebike.service.EmailSerivce;
import application.ebike.service.InvoiceService;

@RestController
@RequestMapping(value = "api/v1.0/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;
    @Autowired
    private EmailSerivce emailService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE })
    public InvoiceDTO saveInvoice(@RequestBody InvoiceDTO invoiceDTO) {
        Invoice invoice = invoiceService.saveInvoice(convertInvoiceDTOToModel(invoiceDTO));
        if (!Objects.isNull(invoice.getId())) {
            emailService.sendMail(parseToEmailDTO(invoiceDTO));
        }

        return convertInvoiceToDTO(invoice);
    }

    private Invoice convertInvoiceDTOToModel(InvoiceDTO invoiceDTO) {
        Invoice invoice = modelMapper.map(invoiceDTO, Invoice.class);
        invoice.setBikeOrders(invoiceDTO.getBikes().stream()
                .map(bike -> BikeOrderItem.builder().invoice(invoice)
                        .bike(Bike.builder().id(bike.getId()).name(bike.getName()).build()).quantity(bike.getQuantity())
                        .build())
                .collect(Collectors.toList()));
        invoice.setOrderDate(LocalDate.now());

        return invoice;
    }

    private InvoiceDTO convertInvoiceToDTO(Invoice invoice) {

        return modelMapper.map(invoice, InvoiceDTO.class);
    }

    private EmailDTO parseToEmailDTO(InvoiceDTO invoice) {
        EmailDTO email = new EmailDTO();
        email.setTo(invoice.getCustomerEmail());
        email.setSubject("Sondors Order confirmation");
        Map<String, Object> templateData = new HashMap<>();
        templateData.put("name", invoice.getCustomerName());
        templateData.put("products", invoice.getBikes());
        email.setData(templateData);

        return email;
    }
}