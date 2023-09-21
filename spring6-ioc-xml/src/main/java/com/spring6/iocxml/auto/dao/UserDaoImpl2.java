package com.spring6.iocxml.auto.dao;

import com.spring6.iocxml.bean_lifecycle.User;

public class UserDaoImpl2 implements UserDao{
    @Override
    public void addUser(User user) {
        System.out.println("userDaoImpl2");
    }
}
