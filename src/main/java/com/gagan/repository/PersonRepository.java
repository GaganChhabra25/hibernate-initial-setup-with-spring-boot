package com.gagan.repository;

import com.gagan.entities.Person;

public interface PersonRepository  {

    public void save(Person person);

    public Person readsPerson(Long Id);

    public void update(Person person, Long Id);
}
