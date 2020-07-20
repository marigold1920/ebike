package application.ebike.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.ebike.model.Bike;
import application.ebike.repository.BikeRepository;

@Service
public class BikeService {

    private BikeRepository bikeRepository;

    @Autowired
    public void setBikeRepository(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    public List<Bike> getBikes() {

        return bikeRepository.findAll();
    }

    public Collection<Bike> saveBikes(Collection<Bike> bikes) {

        return bikeRepository.saveAll(bikes);
    }

    public Bike getBikeDetailsByTitle(String bikeTitle) {

        return bikeRepository.findByTitle(bikeTitle);
    }
}