package com.gagan.controller;

import com.gagan.entities.ws.AddressWS;
import com.gagan.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/address/create/person/{personId}", method = RequestMethod.POST)
    public void createAddress(@RequestBody AddressWS addressWS,
                              @PathVariable Long personId) {
        addressService.createAddress(addressWS, personId);
    }

    @RequestMapping(value = "/address/{addressId}", method = RequestMethod.GET)
    public void readAddress(@PathVariable Long addressId ) {
        addressService.readAddressById(addressId);
    }

    @RequestMapping(value = "address/delete/{addressId}", method = RequestMethod.DELETE)
    public void deleteAddress(@PathVariable Long addressId){
        addressService.deleteAddressById(addressId);
    }
}
