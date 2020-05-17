package com.example.springboot.service;

import com.example.springboot.dao.FakeRepoDatabase;
import com.example.springboot.entity.User;
import org.springframework.cache.annotation.Cacheable;

public class UserService {
    private FakeRepoDatabase fake ;



    @Cacheable("User")
    public User findUserById(long id)
    {
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return this.fake.findUserById(id);
    }
    public void deleteUser(long id)
    {
        this.fake.deleteUser(id);
    }
    public void getUser(User users)
    {

        this.fake.insertUser(users);
    }


}
