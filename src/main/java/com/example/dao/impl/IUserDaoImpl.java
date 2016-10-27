package com.example.dao.impl;

import com.example.dao.IUserDao;
import com.example.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;

/**
 * Created by levont on 25/10/2016.
 */
@Service
public class IUserDaoImpl implements IUserDao {

    protected SessionFactory sessionFactory;
    Transaction tx = null;

    @Autowired
    public IUserDaoImpl(EntityManagerFactory factory) {
        if (factory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }

    @Override
    public void addUser(User user) {
        Session currentSession = sessionFactory.openSession();
        try {
            tx = currentSession.beginTransaction();
            currentSession.persist(user);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            currentSession.close();
        }
    }
}
