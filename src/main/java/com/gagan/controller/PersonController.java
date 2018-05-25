package com.gagan.controller;

import com.gagan.entities.Person;
import com.gagan.entities.ws.PersonWS;
import com.gagan.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

        @RequestMapping(value = "/person/create", method = RequestMethod.POST)
        public void createPerson(@RequestBody PersonWS personWS) {
            System.out.println(personWS);
            personService.create(personWS);
         }

        @RequestMapping(value = "/person/{Id}", method = RequestMethod.GET)
        public void readPersonById(@PathVariable Long Id)
        {
            Person person = personService.readPerson(Id);
            System.out.println("===Calling getter on address====");
            person.getAddressSet().forEach(address -> {
                System.out.println(address.getCity());
            });
        }

        @RequestMapping(value = "person/update/{Id}", method = RequestMethod.POST)
        public void updatePerson(@RequestBody PersonWS personWS, @PathVariable Long Id)
        {
            System.out.println(personWS);
            personService.update(personWS, Id);
        }

        @RequestMapping(value = "/person/delete/{Id}", method = RequestMethod.POST)
        public void deletePerson(@PathVariable Long Id)
        {
             personService.deleteById(Id);
        }
}
