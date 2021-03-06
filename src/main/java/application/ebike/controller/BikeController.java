package application.ebike.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.ebike.dto.BikeDTO;
import application.ebike.dto.BikeDetailsDTO;
import application.ebike.model.Bike;
import application.ebike.service.BikeService;

@RestController
@RequestMapping(value = "api/v1.0/bikes")
public class BikeController {

    @Autowired
    private BikeService bikeService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<BikeDTO> getBikeWithPagination() {

        return bikeService.getBikes().stream().map(this::convertModelToBikeDTO).collect(Collectors.toList());
    }

    @GetMapping(value = "/{bikeTitle}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public BikeDetailsDTO getBikeDetailsByTitle(@PathVariable(name = "bikeTitle") String bikeTitle) {

        return convertModelToBikeDetailsDTO(bikeService.getBikeDetailsByTitle(bikeTitle));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Bike> saveBikes(@RequestBody Collection<Bike> bikes) {

        return bikeService.saveBikes(bikes);
    }

    private BikeDTO convertModelToBikeDTO(Bike bike) {

        return modelMapper.map(bike, BikeDTO.class);
    }

    private BikeDetailsDTO convertModelToBikeDetailsDTO(Bike bike) {

        return modelMapper.map(bike, BikeDetailsDTO.class);
    }
}