package org.example.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @Component 设置ioc管理
 * 切面类
 */
@Component
public class LogAspect {
    //前置
    //@Before(value = "execution(public int org.example.annoaop.CalculatorImpl.add(int, int))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("before log ..." + "method = " + methodName + ",args = " + args);
    }
    //后置
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("after log ..." + "method = " + methodName);
    }

    //异常
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("after throwing log ..." + "method = " + methodName + ",ex=");
        ex.printStackTrace();
    }

    //返回
    public void afterReturningMethod(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("after returning log ..." + "method = " + methodName + ",result=" + result);
    }

    //环绕
    //在上述方法之前之后执行
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        Object result = null;
        try{
            System.out.println("around before log..." + ",method = " + methodName);
            result = joinPoint.proceed();
            System.out.println("around after log..." + ",method = " + methodName + ",result = " + result);
        }catch (Throwable ex){
            System.out.println("around throwable log..." + ",method = " + methodName + ",ex = ");
            ex.printStackTrace();
        }finally {
            System.out.println("around after returning log..." + ",method = " + methodName);
            return result;
        }
    }
}
