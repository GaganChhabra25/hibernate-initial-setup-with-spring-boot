package com.gagan.util;


import com.gagan.entities.Mobile;
import com.gagan.entities.ws.MobileWS;

import java.util.HashSet;
import java.util.Set;

public class MobileUtil {

    public static Set<Mobile> convertListOfWsToRListOfEntity(Set<MobileWS> mobileWSSet) {
        Set<Mobile> mobiles = new HashSet<>();
        mobileWSSet.forEach(mobileWS -> {
            Mobile mobile = new Mobile();
            mobile.setBrand(mobileWS.getBrand());
            mobile.setLaunchDate(mobileWS.getLaunchDate());
            mobile.setPrice(mobileWS.getPrice());
            mobile.setName(mobileWS.getName());

            mobiles.add(mobile);
        });

        return mobiles;
    }
}
