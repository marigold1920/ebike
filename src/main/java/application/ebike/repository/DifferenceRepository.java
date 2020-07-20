package application.ebike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.ebike.model.Difference;

public interface DifferenceRepository extends JpaRepository<Difference, Integer> {

}