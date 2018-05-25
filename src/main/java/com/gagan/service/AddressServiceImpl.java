package com.gagan.service;

import com.gagan.entities.Address;
import com.gagan.entities.Person;
import com.gagan.entities.ws.AddressWS;
import com.gagan.repository.AddressRepository;
import com.gagan.repository.PersonRepository;
import com.gagan.util.AddressUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void createAddress(AddressWS addressWS, Long personId) {
        Address address = AddressUtil.convertWsToEntity(addressWS);
        Person person = personRepository.findOne(personId);

        // Associate Address and Person
        if(person != null) {
            address.setPerson(person);
            person.getAddressSet().add(address);
        }

        addressRepository.save(address);
        personRepository.save(person);
    }

    @Override
    public Address readAddressById(Long addressId) {
        return null;
    }

    @Override
    public void deleteAddressById(Long addressId) {

    }
}
