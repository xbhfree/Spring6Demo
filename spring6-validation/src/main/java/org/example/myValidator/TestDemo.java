package org.example.myValidator;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidatorConfig.class);
        MyService bean = context.getBean(MyService.class);
        User user = new User();
        user.setAge(1);
        user.setName("alisa");
        user.setPhoneNum("133456789");
        user.setMsg("dsad ad");
        String s = bean.testMethod(user);
        System.out.println(s);
    }
}
