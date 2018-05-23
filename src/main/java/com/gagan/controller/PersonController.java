package com.gagan.controller;

import com.gagan.entities.Person;
import com.gagan.service.PersonService;
import com.gagan.util.BaseApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

        @RequestMapping(name = BaseApi.CREATE, method = RequestMethod.POST)
        public void create(@RequestBody Person person) {
            System.out.println(person);
            personService.create(person);
         }
}
