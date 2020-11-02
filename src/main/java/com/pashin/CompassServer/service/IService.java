package com.pashin.CompassServer.service;

import java.util.List;

public interface IService<T> {
    T findById(int id);

    void create(T element);

    void update(T element);

    void delete(T element);

    List<T> findAll();

    boolean findUser(String username, String password);
}
