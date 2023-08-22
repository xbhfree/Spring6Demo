package com.spring6.iocxml.test;

import com.spring6.iocxml.di.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试注入数组
 */
public class TestDiArray {
   @Test
   public void testDiArray(){
       ApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");
       Employee employee =  (Employee)context.getBean("employee");
       employee.work();

   }
}
