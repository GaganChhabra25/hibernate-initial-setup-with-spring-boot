/*
package com.gagan.repository;

import com.gagan.entities.DrivingLicense;
import com.gagan.entities.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DrivingLicenseRepositoryImpl implements DrivingLicenseRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(DrivingLicense drivingLicense) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
            session.persist(drivingLicense);
        transaction.commit();
    }

    @Override
    public Person readsPerson(Long Id) {
        return null;
    }

    @Override
    public void update(DrivingLicense drivingLicense, Long Id) {

    }
}
*/
