package com.cbu.project.controller;

import com.cbu.project.entity.CityEntity;
import com.cbu.project.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public List<CityEntity> getAllCities() {
        return cityService.getAllCities();
    }
}
