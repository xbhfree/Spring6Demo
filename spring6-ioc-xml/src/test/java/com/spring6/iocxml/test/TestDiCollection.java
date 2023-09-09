package com.spring6.iocxml.test;

import com.spring6.iocxml.di.Department;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试注入集合bean
 */
public class TestDiCollection {
    /*测试注入bean集合*/
    @Test
    public void testDiCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.diCollection.xml");
        Department department = (Department) context.getBean("Dept");
        department.info();
    }

    /*测试命名空间*/
    @Test
    public void testDiP(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.diCollection.xml");
        Department department = (Department) context.getBean("DeptP");
        department.info();
    }
}
