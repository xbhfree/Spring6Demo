package com.spring6.iocxml.test;

import com.spring6.iocxml.di.Department;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class TestDiMap {
    @Test
    public void testDiMap(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.diMap.xml");
        Department department = (Department)context.getBean("Dept");
        department.info();
    }
}
