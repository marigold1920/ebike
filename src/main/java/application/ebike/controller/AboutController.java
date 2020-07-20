package application.ebike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.ebike.model.About;
import application.ebike.service.AboutService;

@RestController
@RequestMapping(value = "api/v1.0/abouts")
public class AboutController {

    @Autowired
    private AboutService aboutService;

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public About getContact() {

        return aboutService.getAbout();
    }
}