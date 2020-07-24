package application.ebike.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.ebike.model.Apparel;
import application.ebike.repository.ApparelRepository;

@Service
public class ApparelService {

    @Autowired
    private ApparelRepository apparelRepository;

    public Collection<Apparel> getApparels() {

        return apparelRepository.findAll();
    }
}