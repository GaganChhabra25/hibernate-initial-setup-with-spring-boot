package com.gagan.repository;

import com.gagan.entities.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Person person) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
            session.persist(person);
        transaction.commit();
        session.close();

    }

    @Override
    public Person readsPerson(Long Id) {
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
            Person person = session.load(Person.class, 3l);
            System.out.println("====query executed=====");
            System.out.println("====Transaction complete=====");
        transaction.commit();
        System.out.println("=======Using person object now========");
        System.out.println(person);
        return  person;
    }

    @Override
    public void update(Person person, Long Id) {
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
            Person person1 = session.load(Person.class, Id);
            System.out.println("Person object loaded");
            if(person1 != null) {
                System.out.println("==Select query will fire now");
                person1.setAge(Id);
            }
        System.out.println("===Transaction completed==");
        transaction.commit();
        System.out.println("=== Now update query will be executed");
    }
}
