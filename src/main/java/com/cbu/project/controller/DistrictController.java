package com.cbu.project.controller;

import com.cbu.project.entity.District;
import com.cbu.project.service.DistrictService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("districts")
public class DistrictController {

    private final DistrictService districtService;

    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @GetMapping("{cityId}")
    public List<District> getAllDistrictsByCityId(@PathVariable Integer cityId){
        return districtService.getAllDistrictsByCityId(cityId);
    }
}
