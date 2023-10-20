package org.example.spring6i18n;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        String string = new Date().toString();
        Object[] o = new Object[]{"alisa", string};
        String msg = context.getMessage("test", o, Locale.UK);
        String msg2 = context.getMessage("test", o, Locale.CHINA);
        System.out.println(msg);
        System.out.println(msg2);
    }
}
