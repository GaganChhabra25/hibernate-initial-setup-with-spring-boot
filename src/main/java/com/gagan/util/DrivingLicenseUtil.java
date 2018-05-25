package com.gagan.util;


import com.gagan.entities.DrivingLicense;
import com.gagan.entities.Person;
import com.gagan.entities.ws.DrivingLicenseWS;

public class DrivingLicenseUtil {

    public static DrivingLicense convertWSToEntity(Person person, DrivingLicenseWS drivingLicenseWS) {
        DrivingLicense drivingLicense = new DrivingLicense();
        drivingLicense.setNumber(drivingLicenseWS.getNumber());
        drivingLicense.setExpiryDate(drivingLicenseWS.getExpiryDate());
        drivingLicense.setIssueDate(drivingLicenseWS.getIssueDate());
        drivingLicense.setLocation(drivingLicenseWS.getLocation());

        return drivingLicense;
    }
}
