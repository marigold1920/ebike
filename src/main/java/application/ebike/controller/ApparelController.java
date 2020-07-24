package application.ebike.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.ebike.dto.ApparelDTO;
import application.ebike.model.Apparel;
import application.ebike.service.ApparelService;

@RestController
@RequestMapping(value = "api/v1.0/apparels")
public class ApparelController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ApparelService apparelService;

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public Collection<ApparelDTO> getApparels() {

        return apparelService.getApparels().stream().map(this::converModelToDTO).collect(Collectors.toList());
    }

    private ApparelDTO converModelToDTO(Apparel apparel) {

        return modelMapper.map(apparel, ApparelDTO.class);
    }
}