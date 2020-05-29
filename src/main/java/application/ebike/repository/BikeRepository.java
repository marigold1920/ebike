package application.ebike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.ebike.model.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer> {
    
}