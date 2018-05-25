package com.gagan.entities.ws;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gagan.entities.Person;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


@Setter@Getter
@XmlRootElement(name = "driving-license")
@XmlAccessorType(XmlAccessType.FIELD)
public class DrivingLicenseWS {

    private long Id;
    @NotNull
    private Long number;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @NotNull
    private Date issueDate;
    @NotNull
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date expiryDate;
    @NotNull
    private String location;

    private Person person;

}
