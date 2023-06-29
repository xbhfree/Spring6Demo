package com.spring6.iocxml.test;

import com.spring6.iocxml.bean.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = (UserDao)context.getBean(UserDao.class);
        userDao.run();
    }
}
