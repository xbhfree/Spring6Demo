package com.spring6.iocxml.auto.controller;

import com.spring6.iocxml.auto.service.UserService;
import com.spring6.iocxml.bean_lifecycle.User;
import lombok.Setter;

public class UserController {
    @Setter
    private UserService userService;

    public void addUser(){
        System.out.println("add user controller");
        userService.addUser(new User());
    }
}
