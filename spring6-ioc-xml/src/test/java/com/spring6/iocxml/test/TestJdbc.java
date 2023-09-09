package com.spring6.iocxml.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
    @Test
    public void test01(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring6?serverTimezone=UTC");
        dataSource.setPassword("xbh123456");
        dataSource.setUsername("root");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource = (DruidDataSource)context.getBean("druidDataSource");
        System.out.println(dataSource.getUrl());
    }
}
