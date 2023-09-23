package org.example.autowired.service;

import org.example.autowired.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    //根据类型自动匹配
    @Autowired
    private UserBean userBean;
    @Override
    public void add() {
        System.out.println("add service...");
        userBean.add();
    }
}
