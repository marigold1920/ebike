package application.ebike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.ebike.model.Apparel;

public interface ApparelRepository extends JpaRepository<Apparel, Integer> {

}