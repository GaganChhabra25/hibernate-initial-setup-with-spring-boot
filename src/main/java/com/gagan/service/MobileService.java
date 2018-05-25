package com.gagan.service;


import com.gagan.entities.ws.MobileWS;

import java.util.Set;

public interface MobileService {

    public void createMobiles(Set<MobileWS> mobileWSSet, Set<Long> personsId);
}
