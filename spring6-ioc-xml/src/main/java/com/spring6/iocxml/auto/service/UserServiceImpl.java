package com.spring6.iocxml.auto.service;

import com.spring6.iocxml.bean_lifecycle.User;

public class UserServiceImpl  implements  UserService{
    @Override
    public void addUser(User user) {
        System.out.println("add user service");
        System.out.println(user);
    }
}
