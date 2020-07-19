package application.ebike.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.ebike.model.Bike;
import application.ebike.service.BikeService;

@RestController
@RequestMapping(value = "api/v1.0/bikes")
public class BikeController {

    private BikeService bikeService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Bike> getBikeWithPagination() {

        return bikeService.getBikes();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Bike> saveBikes(@RequestBody Collection<Bike> bikes) {

        return bikeService.saveBikes(bikes);
    }

    @Autowired
    public void setBikeService(BikeService bikeService) {
        this.bikeService = bikeService;
    }
}