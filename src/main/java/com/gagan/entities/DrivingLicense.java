package com.gagan.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Setter@Getter
@NoArgsConstructor
public class DrivingLicense {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private Long number;
    private Date issueDate;
    private Date expiryDate;
    private String location;

    @OneToOne(mappedBy = "drivingLicense")
    private Person person;

}
