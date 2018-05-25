package com.gagan.service;


import com.gagan.entities.DrivingLicense;
import com.gagan.entities.ws.DrivingLicenseWS;

public interface DrivingLicenseService {

    public void create(DrivingLicenseWS drivingLicenseWS);

    public DrivingLicense readDrivingLicenseById(Long Id);

    public void update(DrivingLicenseWS drivingLicenseWS, Long Id);
}
