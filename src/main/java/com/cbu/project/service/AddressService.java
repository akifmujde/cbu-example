package com.cbu.project.service;

import com.cbu.project.converter.AddressEntityConverter;
import com.cbu.project.dto.request.CreateAddressRequest;
import com.cbu.project.entity.AddressEntity;
import com.cbu.project.exception.AddressTitleAlreadyExistException;
import com.cbu.project.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;
    private final AddressEntityConverter addressEntityConverter;

    public AddressService(AddressRepository addressRepository, AddressEntityConverter addressEntityConverter) {
        this.addressRepository = addressRepository;
        this.addressEntityConverter = addressEntityConverter;
    }

    public List<AddressEntity> getAllAddresses() {
        return addressRepository.findAll();
    }

    public List<AddressEntity> getAllAddressesByMemberId(Long memberId) {
        return addressRepository.findAllByMemberId(memberId);
    }

    public void createAddress(CreateAddressRequest request) {
        Boolean addressAlreadyExist = addressRepository.isExistsByMemberIdAndTitle(request.getMemberId(), request.getTitle());
        if (addressAlreadyExist) {
            throw new AddressTitleAlreadyExistException("address veri tabanında var");
        }

        AddressEntity addressEntity = addressEntityConverter.convert(request);
        addressRepository.save(addressEntity);
    }
}
