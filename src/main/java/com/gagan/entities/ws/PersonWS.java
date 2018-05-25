package com.gagan.entities.ws;

import com.gagan.entities.DrivingLicense;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

@Setter@Getter
@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonWS {

    private Long id;
    @NotNull
    private String fname;
    @NotNull
    private String lname;
    @NotNull
    private Long age;
    @NotNull
    private Long phone;
    @NotNull
    private String email;
    private DrivingLicense drivingLicense;

    private Set<AddressWS> addressWSList = new HashSet<AddressWS>();
}
