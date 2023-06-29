package com.spring6.iocxml.test;

import com.spring6.iocxml.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void UserTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean
        User user = (User)context.getBean("user");
        System.out.println(user);
        //根据类型获取bean
        User user2 = (User)context.getBean(User.class);
        System.out.println(user2);
        //根据id和类型获取bean
        User user3 = (User)context.getBean("user",User.class);
        System.out.println(user3);
    }
}
