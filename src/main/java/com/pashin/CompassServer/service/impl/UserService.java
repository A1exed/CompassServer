package com.pashin.CompassServer.service.impl;

import com.pashin.CompassServer.dao.IDAO;
import com.pashin.CompassServer.dao.impl.UserDAO;
import com.pashin.CompassServer.entity.User;
import com.pashin.CompassServer.service.IService;

import java.util.List;

public class UserService implements IService<User> {

    IDAO<User> userDAO = new UserDAO();

    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }

    @Override
    public void create(User user) {
        userDAO.create(user);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public boolean findUser(String username, String password) {
        return userDAO.findUser(username, password);
    }
}
