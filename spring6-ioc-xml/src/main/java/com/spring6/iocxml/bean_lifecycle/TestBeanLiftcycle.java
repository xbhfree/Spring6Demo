package com.spring6.iocxml.bean_lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试bean的生命周期
 * 具体的生命周期过程：
 *     、1. bean对象创建（调用无参构造）
 *     2. 给bean对象设置属性
 *     3. bean的后置处理（初始化之前）
 *     4. bean对象初始化（需要在配置bean时制定初始化方法）
 *     5. bean的后置处理器（初始化之后）
 *     6. bean对象就绪
 *     7. bean对象销毁
 *     8. Ioc容器关闭
 */
public class TestBeanLiftcycle {
    @Test
    public void testBeanLiftcycle(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle.xml");
        User user = (User) context.getBean("user");
        System.out.println("6. bean对象就绪");
        context.close();//销毁
    }
}
