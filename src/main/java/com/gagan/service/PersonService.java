package com.gagan.service;


import com.gagan.entities.Person;
import com.gagan.entities.ws.PersonWS;

public interface PersonService {

    public void create(PersonWS personWS);

    public Person readPerson(Long Id);

    public void update(PersonWS personWS, Long Id);

    public void deleteById(Long personId);
}
