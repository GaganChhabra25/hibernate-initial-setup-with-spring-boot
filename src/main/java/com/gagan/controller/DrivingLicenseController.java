package com.gagan.controller;

import com.gagan.entities.DrivingLicense;
import com.gagan.entities.ws.DrivingLicenseWS;
import com.gagan.service.DrivingLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DrivingLicenseController {

    @Autowired
    DrivingLicenseService drivingLicenseService;

    @RequestMapping(value = "/drivingLicense/create", method = RequestMethod.POST)
    public void createDrivingLicense(@RequestBody DrivingLicenseWS drivingLicenseWS) {
        System.out.println(drivingLicenseWS.getPerson().getId());
        drivingLicenseService.create(drivingLicenseWS);
    }

    @RequestMapping(value = "/drivingLicense/{Id}", method = RequestMethod.GET)
    public void readDrivingLicenseById(@PathVariable Long Id)
    {
        DrivingLicense drivingLicense = drivingLicenseService.readDrivingLicenseById(Id);
        System.out.println(drivingLicense);
    }

    @RequestMapping(value = "drivingLicense/update/{Id}", method = RequestMethod.POST)
    public void updateDrivingLicense(@RequestBody DrivingLicenseWS drivingLicense, @PathVariable Long Id)
    {
        System.out.println(drivingLicense);
        drivingLicenseService.update(drivingLicense, Id);
    }
}
