package com.cbu.project.repository;

import com.cbu.project.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District, Integer> {

    @Query(nativeQuery = true, value = "select * from district where city_id = ?1")
    List<District> findAllByCityId(Integer cityId);
}
