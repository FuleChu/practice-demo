package com.chu.practicedemo.service;

import com.chu.practicedemo.module.User;

/**
 * @author admin
 */
public interface UserService{

    void add(User user);

    User select(int id);

    void update(User user);

    void delete(int id);
}
