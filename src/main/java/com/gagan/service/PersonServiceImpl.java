package com.gagan.service;

import com.gagan.entities.Person;
import com.gagan.entities.ws.PersonWS;
import com.gagan.repository.PersonRepository;
import com.gagan.util.PersonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void create(PersonWS personWS)
    {
        Person person = PersonUtil.convertWSToEntity(personWS);
        personRepository.save(person);
    }

    @Override
    public Person readPerson(Long Id) {
        return personRepository.findOne(Id);
    }

    @Override
    public void update(PersonWS personWS, Long Id) {
        Person person = PersonUtil.convertWSToEntity(personWS);
        person.setId(Id);
    }

    @Override
    public void deleteById(Long personId) {
        personRepository.delete(personId);
    }
}
