package com.pashin.CompassServer.dao.impl;

import com.pashin.CompassServer.dao.IDAO;
import com.pashin.CompassServer.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserDAO implements IDAO<User> {

    @Override
    public User findById(int id) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }

    @Override
    public void create(User user) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(User user) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(User user) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    @Override
    public List<User> findAll() {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        List<User> users = (List<User>)session.createQuery("from User").list();
        session.close();
        return users;
    }

    @Override
    public boolean findUser(String username, String password) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        User user = (User) session.createQuery("from User where username='" + username + "' and password='" + password + "'").uniqueResult();
        session.close();
        return user != null;
    }
}
