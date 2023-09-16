package com.spring6.iocxml.factorybean;

import com.spring6.iocxml.bean_lifecycle.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserFactoryBean {

    @Test
    public void testUserFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-userfactorybean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
