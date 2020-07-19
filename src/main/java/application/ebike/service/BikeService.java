package application.ebike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.ebike.model.Bike;
import application.ebike.repository.BikeRepository;

@Service
public class BikeService {

    private BikeRepository bikeRepository;

    public List<Bike> getBikes() {

        return bikeRepository.findAll();
    }

    @Autowired
    public void setBikeRepository(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }
}