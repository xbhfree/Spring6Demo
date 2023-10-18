package org.example.resourceloader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class Demo {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Resource resource = context.getResource("resourceTestDemo.txt");
        System.out.println(resource.getFilename());
    }

    @Test
    public void test02(){
        ApplicationContext context = new FileSystemXmlApplicationContext();
        Resource resource = context.getResource("resourceTestDemo.txt");
        System.out.println(resource.getFilename());
    }
}
