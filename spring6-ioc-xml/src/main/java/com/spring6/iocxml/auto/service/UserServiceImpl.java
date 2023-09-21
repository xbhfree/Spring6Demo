package com.spring6.iocxml.auto.service;

import com.spring6.iocxml.auto.dao.UserDao;
import com.spring6.iocxml.bean_lifecycle.User;
import lombok.Setter;

public class UserServiceImpl  implements  UserService{

    @Setter
    private UserDao userDao;
    @Override
    public void addUser(User user) {
        System.out.println("add user service");
        System.out.println(user);
        userDao.addUser(user);
    }
}
