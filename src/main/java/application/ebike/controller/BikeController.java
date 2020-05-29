package application.ebike.controller;

import java.util.Collection;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.ebike.model.Bike;

@RestController
@RequestMapping(value = "api/v1.0", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class BikeController {
    
    @GetMapping
    public Collection<Bike> getBikeWithPagination(@PathVariable(name = "page") int page) {
        
        return null;
    }

    
}