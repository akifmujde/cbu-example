package com.cbu.project.service;

import com.cbu.project.entity.District;
import com.cbu.project.repository.DistrictRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    private final DistrictRepository districtRepository;

    public DistrictService(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    public List<District> getAllDistrictsByCityId(int cityId) {
        return districtRepository.findAllByCityId(cityId);
    }
}
