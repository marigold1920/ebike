package application.ebike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.ebike.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
