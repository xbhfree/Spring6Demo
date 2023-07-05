package com.spring6.iocxml.test;

import com.spring6.iocxml.di.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testBookSetter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book_setter_di",Book.class);
        System.out.println(book);
    }


    @Test
    public void testBookConstructorByName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book_constructor_di_byname",Book.class);
        System.out.println(book);
    }

    @Test
    public void testBookConstructorByIndex(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book_constructor_di_byindex",Book.class);
        System.out.println(book);
    }
}
