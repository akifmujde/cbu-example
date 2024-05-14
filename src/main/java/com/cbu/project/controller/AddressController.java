package com.cbu.project.controller;

import com.cbu.project.dto.request.CreateAddressRequest;
import com.cbu.project.entity.AddressEntity;
import com.cbu.project.service.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("addresses")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<AddressEntity> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("{memberId}")
    public List<AddressEntity> getAllAddressesByMemberId(@PathVariable Long memberId) {
        return addressService.getAllAddressesByMemberId(memberId);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void createAddress(@RequestBody CreateAddressRequest request) {
        addressService.createAddress(request);
    }
}
