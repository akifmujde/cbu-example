package com.cbu.project.converter;

import com.cbu.project.dto.request.CreateAddressRequest;
import com.cbu.project.entity.AddressEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressEntityConverter {

    public AddressEntity convert(CreateAddressRequest request) {
        AddressEntity addressEntity = new AddressEntity();

        addressEntity.setTitle(request.getTitle());
        addressEntity.setPlainAddress(request.getPlainAddress());
        addressEntity.setCityId(request.getCityId());
        addressEntity.setDistrictId(request.getDistrictId());
        addressEntity.setMemberId(request.getMemberId());

        return addressEntity;
    }
}
