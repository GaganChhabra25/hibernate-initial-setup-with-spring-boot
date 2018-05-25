package com.gagan.service;

import com.gagan.entities.Mobile;
import com.gagan.entities.Person;
import com.gagan.entities.ws.MobileWS;
import com.gagan.repository.MobileRepository;
import com.gagan.repository.PersonRepository;
import com.gagan.util.MobileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class MobileServiceImpl implements MobileService {

    @Autowired
    private MobileRepository mobileRepository;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void createMobiles(Set<MobileWS> mobileWSSet, Set<Long> personsId ) {
        Set<Mobile> mobiles = MobileUtil.convertListOfWsToRListOfEntity(mobileWSSet);
       List<Person> persons = personRepository.findAll(personsId);
        if(persons !=null) {
            persons.forEach(person -> {
                person.getMobiles().addAll(mobiles);
            });

            mobiles.forEach(mobile -> {
                mobile.getPersons().addAll(persons);
            });
        }
        mobileRepository.save(mobiles);
        personRepository.save(persons);
    }
}
