package org.example.prefix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application 支持同时加载多个配置文件
 */
public class TestDemo {
    public static void main(String[] args) {
        //强制以classpath方式创建context访问资源文件，且classpath*:也可以加通配符,有通配符默认spring之加载第一个搜索到的符合条件的文件
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean*.xml");
        User bean = context.getBean(User.class);
        System.out.println(bean);
    }
}
