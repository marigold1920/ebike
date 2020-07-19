package application.ebike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.ebike.model.Elementor;

public interface ElementorRepository extends JpaRepository<Elementor, Integer> {

}