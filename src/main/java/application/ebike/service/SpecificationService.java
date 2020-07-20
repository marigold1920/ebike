package application.ebike.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.ebike.model.Specification;
import application.ebike.repository.SpecificationRepository;

@Service
public class SpecificationService {

    @Autowired
    private SpecificationRepository specificationRepository;

    public Collection<Specification> saveSpecifications(Collection<Specification> specifications) {

        return specificationRepository.saveAll(specifications);
    }
}