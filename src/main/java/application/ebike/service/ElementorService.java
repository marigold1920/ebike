package application.ebike.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.ebike.model.Elementor;
import application.ebike.repository.ElementorRepository;

@Service
public class ElementorService {

    private ElementorRepository elementorRepository;

    @Autowired
    public void setElementorRepository(ElementorRepository elementorRepository) {
        this.elementorRepository = elementorRepository;
    }

    public Collection<Elementor> saveElementors(Collection<Elementor> elementors) {

        return elementorRepository.saveAll(elementors);
    }
}