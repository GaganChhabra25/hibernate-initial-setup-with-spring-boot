package com.gagan.service;


import com.gagan.entities.Person;

public interface PersonService {

    public void create(Person person);

    public Person readPerson(Long Id);

    public void update(Person person, Long Id);
}
