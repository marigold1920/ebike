package application.ebike.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.ebike.model.Invoice;
import application.ebike.repository.InvoiceRepository;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public Invoice saveInvoice(Invoice invoice) {

        return invoiceRepository.save(invoice);
    }

    public Collection<Invoice> getInvoicesByUserId(String userId) {

        return invoiceRepository.findByUid(userId);
    }
}