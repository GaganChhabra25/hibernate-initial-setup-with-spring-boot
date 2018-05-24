package com.gagan.controller;

import com.gagan.entities.Person;
import com.gagan.service.PersonService;
import com.gagan.util.BaseApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

        @RequestMapping(name = BaseApi.CREATE, method = RequestMethod.POST)
        public void create(@RequestBody Person person) {
            System.out.println(person);
            personService.create(person);
         }

        @RequestMapping(value = "/person/{Id}", method = RequestMethod.GET)
        public void readPersonById(@PathVariable Long Id)
        {
            Person person = personService.readPerson(Id);
            System.out.println(person);
        }

        @RequestMapping(value = "/update/person/{Id}", method = RequestMethod.POST)
        public void updatePerson(@RequestBody Person person, @PathVariable Long Id)
        {
            System.out.println(person);
            personService.update(person, Id);
        }
}
