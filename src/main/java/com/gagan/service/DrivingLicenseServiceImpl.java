package com.gagan.service;

import com.gagan.entities.DrivingLicense;
import com.gagan.entities.Person;
import com.gagan.entities.ws.DrivingLicenseWS;
import com.gagan.repository.DrivingLicenseRepository;
import com.gagan.repository.PersonRepository;
import com.gagan.util.DrivingLicenseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DrivingLicenseServiceImpl implements DrivingLicenseService {

    @Autowired
    private DrivingLicenseRepository drivingLicenseRepository;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void create(DrivingLicenseWS drivingLicenseWS) {
        Long personId = drivingLicenseWS.getPerson().getId();
        Person person = getPerson(personId);
        DrivingLicense drivingLicense = DrivingLicenseUtil.convertWSToEntity(person,  drivingLicenseWS);

        // Associate person with driving license
        drivingLicense.setPerson(person);
        person.setDrivingLicense(drivingLicense);

        drivingLicenseRepository.save(drivingLicense);
        personRepository.save(person);

    }

    @Override
    public DrivingLicense readDrivingLicenseById(Long Id) {
        return null;
    }

    @Override
    public void update(DrivingLicenseWS drivingLicense, Long Id) {

    }

    @Transactional
    public  Person getPerson(Long personId) {
        return personRepository.findOne(personId);
    }
}
