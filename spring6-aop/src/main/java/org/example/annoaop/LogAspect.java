package org.example.annoaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Aspect 设置代理类
 * @Component 设置ioc管理
 * 切面类
 */
@Aspect
@Component
public class LogAspect {
    /**
     * value具体规则可间resources内图片
     */
    //前置
    //@Before(value = "execution(public int org.example.annoaop.CalculatorImpl.add(int, int))")
    @Before(value = "execution(public int org.example.annoaop.*.*(..))")
    public void beforeMethod(){
        System.out.println("before log ...");
    }
    //返回

    //异常

    //后置

    //环绕
}
