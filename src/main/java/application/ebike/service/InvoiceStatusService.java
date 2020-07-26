package application.ebike.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.ebike.model.InvoiceStatus;
import application.ebike.repository.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {

    @Autowired
    private InvoiceStatusRepository invoiceStatusRepository;

    public InvoiceStatus getInitStatus() {

        return invoiceStatusRepository.findByValue("Processing");
    }
}