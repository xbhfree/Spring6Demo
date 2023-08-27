package com.spring6.iocxml.test;

import com.spring6.iocxml.di.Department;
import com.spring6.iocxml.di.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDiList {
    @Test
    public void testDiList(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diList.xml");
        Department department = (Department)context.getBean("dept");
        department.info();
    }
}
