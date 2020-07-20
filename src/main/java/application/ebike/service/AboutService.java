package application.ebike.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.ebike.model.About;
import application.ebike.repository.AboutRepository;

@Service
public class AboutService {

    @Autowired
    private AboutRepository AboutRepository;

    public About getAbout() {
        var abouts = AboutRepository.findAll();

        return abouts.get(abouts.size() - 1);
    }

}