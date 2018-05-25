package com.gagan.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter@Getter
@NoArgsConstructor
public class Mobile {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String Brand;
    private Date launchDate;
    private Long price;

    @ManyToMany(mappedBy = "mobiles")
    private Set<Person> persons = new HashSet<Person>();
}
