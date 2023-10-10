package org.example.annoaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspect {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        // 基于接口的动态代理必须用接口定义，用实现类会找不到的
        Calculator calculator = context.getBean(Calculator.class);
        calculator.div(1,0);
    }
}
