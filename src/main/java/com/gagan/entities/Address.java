package com.gagan.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Entity
@Setter@Getter
@NoArgsConstructor
public class Address {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private Long houseNumber;
    private String city;
    private String state;
    private Long pin;

    @ManyToOne
    private Person person;
}
