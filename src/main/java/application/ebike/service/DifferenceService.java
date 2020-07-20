package application.ebike.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.ebike.model.Difference;
import application.ebike.repository.DifferenceRepository;

@Service
public class DifferenceService {

    @Autowired
    private DifferenceRepository differenceRepository;

    public Collection<Difference> getDifferences() {

        return differenceRepository.findAll();
    }
}