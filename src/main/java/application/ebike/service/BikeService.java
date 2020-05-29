package application.ebike.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import application.ebike.model.Bike;
import application.ebike.repository.BikeRepository;

@Service
public class BikeService {
    
    private BikeRepository bikeRepository;

    public Collection<Bike> getBikesWithPagination(int page) {
        PageRequest pagination = PageRequest.of(page - 1, 40);
        
        return bikeRepository.findAll(pagination).getContent();
    }

    @Autowired
    public void setBikeRepository(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }
}