package com.gagan.service;

import com.gagan.entities.Person;
import com.gagan.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void create(Person person) {
        personRepository.save(person);
    }
}
