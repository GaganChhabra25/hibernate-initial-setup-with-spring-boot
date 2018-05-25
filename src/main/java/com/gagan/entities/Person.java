package com.gagan.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter@Getter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fname;
    private String lname;
    private Long age;
    private Long phone;
    private String email;

    @OneToOne
    @Cascade(CascadeType.DELETE)
    private DrivingLicense drivingLicense;

    @OneToMany(mappedBy = "person")
    @Cascade(CascadeType.DELETE)
    private Set<Address> addressSet = new HashSet<Address>();

    @ManyToMany()
    private Set<Mobile> mobiles = new HashSet<Mobile>();

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", drivingLicense=" + drivingLicense +
                '}';
    }
}
