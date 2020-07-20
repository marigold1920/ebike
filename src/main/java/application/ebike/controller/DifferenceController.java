package application.ebike.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.ebike.model.Difference;
import application.ebike.service.DifferenceService;

@RestController
@RequestMapping(value = "api/v1.0/differences")
public class DifferenceController {

    @Autowired
    private DifferenceService differenceService;

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public Collection<Difference> getDiffrences() {

        return differenceService.getDifferences();
    }
}