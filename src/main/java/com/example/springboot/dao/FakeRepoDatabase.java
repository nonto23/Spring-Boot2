package com.example.springboot.dao;

import com.example.springboot.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class FakeRepoDatabase implements FakeRepoInterface {

    private static Map<Integer, User> user;

    static{
        user=new HashMap<Integer, User>(){
            {
                put(1,new User(1,"nonto","Mbonani"));
                put(2,new User(2,"Zano","Mthelekiso"));
                put(3,new User(3,"Dktso","masombuka"));


            }
        };
    }

    @Override
    public void insertUser(User users) {

            this.user.put((int) users.getId(),users);

    }

    @Override
    public User findUserById(long id) {

            return this.user.get(id);
    }

    @Override
    public void deleteUser(long id) {
        this.user.remove(id);
    }
}
