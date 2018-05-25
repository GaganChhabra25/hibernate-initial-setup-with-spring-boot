package com.gagan.controller;

import com.gagan.entities.ws.MobileWrapper;
import com.gagan.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @RequestMapping(value = "/mobile/create", method = RequestMethod.POST)
    public void createMobile(@RequestBody MobileWrapper mobileWrapper) {
        mobileService.createMobiles(mobileWrapper.getMobiles(), mobileWrapper.getPersons());
        mobileWrapper.getMobiles().forEach(mobileWS -> {
            System.out.println(mobileWS.getName());
        });

        mobileWrapper.getPersons().forEach(aLong -> {
            System.out.println("person id  = " + aLong);
        });

    }
}
