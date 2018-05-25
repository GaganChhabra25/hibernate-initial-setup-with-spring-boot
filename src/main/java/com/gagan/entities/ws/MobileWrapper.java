package com.gagan.entities.ws;


import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

@XmlRootElement(name = "mobiles")
@XmlAccessorType(XmlAccessType.FIELD)
public class MobileWrapper {

    @NotNull
    private Set<MobileWS> mobiles   = new HashSet<MobileWS>();

    private Set<Long> persons  = new HashSet<Long>();

    public Set<MobileWS> getMobiles() {
        return mobiles;
    }

    public void setMobiles(Set<MobileWS> mobiles) {
        this.mobiles = mobiles;
    }

    public Set<Long> getPersons() {
        return persons;
    }

    public void setPersons(Set<Long> persons) {
        this.persons = persons;
    }
}
