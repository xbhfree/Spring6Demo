package org.example.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 基于方法的数据校验
 *
 *错误消息可以从异常ConstraintViolationException
 *的getConstraintViolations()方法里获得的
 * 不知全局异常处理即可获取错误信息
 */
public class TestMethod {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidatorConfig.class);
        MyService bean = context.getBean(MyService.class);
        User user = new User();
        user.setAge(-1);
        user.setName("alisa");
        String s = bean.testMethod(user);
        System.out.println(s);
    }
}
