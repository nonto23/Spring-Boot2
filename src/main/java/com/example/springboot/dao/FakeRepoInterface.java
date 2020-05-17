package com.example.springboot.dao;

import com.example.springboot.entity.User;

public interface FakeRepoInterface {

    void insertUser(User user);

    User findUserById(long id);

    void deleteUser(long id);
}
