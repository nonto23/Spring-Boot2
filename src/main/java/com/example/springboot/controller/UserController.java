package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import com.example.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
   private  UserService services ;

    @RequestMapping(value = "{/id}",method = RequestMethod.GET)
    public User findUserById(@PathVariable("id") long id)
    {
        return this.services.findUserById(id);
    }

    @RequestMapping(value = "{/id}",method = RequestMethod.DELETE)
    public void  removeUser(@PathVariable("id")long id)
    {
         services.deleteUser(id);
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public void addAsset(@RequestBody User user){
        services.getUser( user);
    }

}
