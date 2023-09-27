package org.example.resource;

import org.example.resource.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResource {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController controller = context.getBean(UserController.class);
        controller.add();
    }
}
