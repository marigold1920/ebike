package application.ebike.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.ebike.model.Elementor;
import application.ebike.service.ElementorService;

@RestController
@RequestMapping(value = "api/v1.0/elementors")
public class ElementorController {

    @Autowired
    private ElementorService elementorService;

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public Collection<Elementor> getElementors() {

        return elementorService.getElementors();
    }

    @PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE })
    public Collection<Elementor> saveElementors(@RequestBody Collection<Elementor> elementors) {

        return elementorService.saveElementors(elementors);
    }
}