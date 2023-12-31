package org.example.xmlaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspect {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");
        // 基于接口的动态代理必须用接口定义，用实现类会找不到的
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(1,2);
    }
}
