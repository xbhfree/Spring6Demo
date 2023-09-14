package com.spring6.iocxml.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    @Test
    public void testSingleton(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Order order = (Order) context.getBean("order_singleton");
        Order order2 = (Order) context.getBean("order_singleton");
        System.out.println(order);
        System.out.println(order2);
    }

    @Test
    public void testPrototype(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Order order = (Order) context.getBean("order_prototype");
        Order order2 = (Order) context.getBean("order_prototype");
        System.out.println(order);
        System.out.println(order2);

    }
}
