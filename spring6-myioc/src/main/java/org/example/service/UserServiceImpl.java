package org.example.service;

import org.example.anno.Bean;
import org.example.anno.Di;
import org.example.dao.UserDao;

@Bean
public class UserServiceImpl implements UserService{

    @Di
    private UserDao userDao;
    @Override
    public void run() {
        System.out.println("user service run...");
        userDao.run();
    }
}
