package application.ebike.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.ebike.model.Specification;
import application.ebike.service.SpecificationService;

@RestController
@RequestMapping(value = "api/v1.0/specifications")
public class SpecificationController {

    @Autowired
    private SpecificationService specificationService;

    @PostMapping
    public Collection<Specification> saveSpecifications(@RequestBody Collection<Specification> specifications) {

        return specificationService.saveSpecifications(specifications);
    }
}