package application.ebike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.ebike.model.About;

public interface AboutRepository extends JpaRepository<About, Integer> {

}