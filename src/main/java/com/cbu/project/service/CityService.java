package com.cbu.project.service;

import com.cbu.project.entity.CityEntity;
import com.cbu.project.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<CityEntity> getAllCities() {
        return cityRepository.findAll();
    }
}
