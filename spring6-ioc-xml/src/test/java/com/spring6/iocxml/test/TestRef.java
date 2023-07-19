package com.spring6.iocxml.test;

import com.spring6.iocxml.di.Department;
import com.spring6.iocxml.di.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestRef {
    @Test
    public void testDeptAndEmp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ref.xml");
        Department department = (Department)context.getBean("department");
        Employee employee = (Employee)context.getBean("employee");
        employee.work();
    }
}
