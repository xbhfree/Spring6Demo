package org.example.anno;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerson {

    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyValidatorConfig.class);
        MyValidation1 myValidation1 = context.getBean(MyValidation1.class);
        Person person = new Person();
        person.setName("alisa");
        person.setAge(-1);
        boolean b = myValidation1.validatorByPersonOne(person);
        System.out.println(b);
    }

    @Test
    public void test02(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyValidatorConfig.class);
        MyValidation2 myValidation2 = context.getBean(MyValidation2.class);
        Person person = new Person();
        person.setName("alisa");
        person.setAge(-1);
        boolean b = myValidation2.validatorByPersonTwo(person);
        System.out.println(b);
    }
}
