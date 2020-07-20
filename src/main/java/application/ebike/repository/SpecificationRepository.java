package application.ebike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.ebike.model.Specification;

public interface SpecificationRepository extends JpaRepository<Specification, Integer> {

}