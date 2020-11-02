package com.pashin.CompassServer.dao;

import java.util.List;

public interface IDAO<T> {
    T findById(int id);

    void create(T element);

    void update(T element);

    void delete(T element);

    List<T> findAll();

    boolean findUser(String username, String password);
}
