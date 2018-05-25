package com.gagan.util;


import com.gagan.entities.Address;
import com.gagan.entities.ws.AddressWS;

public class AddressUtil {

    public static Address convertWsToEntity(AddressWS addressWS) {
        Address address = new Address();
        address.setHouseNumber(addressWS.getHouseNumber());
        address.setCity(addressWS.getCity());
        address.setPin(addressWS.getPin());
        address.setState(addressWS.getState());
        return address;
    }
}
