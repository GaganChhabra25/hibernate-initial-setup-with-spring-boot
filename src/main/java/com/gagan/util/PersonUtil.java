package com.gagan.util;

import com.gagan.entities.Person;
import com.gagan.entities.ws.PersonWS;

public class PersonUtil {

    public static Person convertWSToEntity(PersonWS personWS) {
        Person person = new Person();
        person.setFname(personWS.getFname());
        person.setLname(personWS.getLname());
        person.setAge(personWS.getAge());
        person.setEmail(personWS.getEmail());
        person.setPhone(personWS.getPhone());
        return person;
    }

    public static Person populatePerson(Person person){
        Person person1 = new Person();
        person1.setId(person.getId());
        person1.setAge(person.getAge());
        person1.setPhone(person.getPhone());
        person1.setEmail(person.getEmail());
        person1.setFname(person.getFname());
        person1.setLname(person.getLname());
        return person1;
    }
}
