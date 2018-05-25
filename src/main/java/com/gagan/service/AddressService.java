package com.gagan.service;

import com.gagan.entities.Address;
import com.gagan.entities.ws.AddressWS;

public interface AddressService {

    public void createAddress(AddressWS addressWS, Long personId);

    public Address readAddressById(Long addressId);

    public void deleteAddressById(Long addressId);
}
