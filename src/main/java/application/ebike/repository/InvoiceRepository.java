package application.ebike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.ebike.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}