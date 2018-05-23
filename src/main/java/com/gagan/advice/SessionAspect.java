package com.gagan.advice;

import org.aspectj.lang.annotation.Aspect;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SessionAspect {

    @Autowired
    private SessionFactory sessionFactory;

    private Session session;
    private Transaction transaction;

  /*  @Before("execution(* (@org.springframework.stereotype.Repository *).*(..))")*/
    public void beginTransaction() {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        System.out.println("Session created  for " + session.getClass().getName());
    }

/*    @After("execution(* (@org.springframework.stereotype.Repository *).*(..))")*/
    public void closeTransaction() {
        transaction.commit();
        session.close();
        System.out.println("session closed for " + session.getClass().getName());
    }
}
