package com.spring6.iocxml.bean_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * @author xbhfree
 * 后置处理器对所有bean生效
 */
public class MyBeanPost implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3. bean的后置处理（初始化之前）");
        System.out.println(bean + " , " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5. bean的后置处理器（初始化之后）");
        System.out.println(bean + " , " + beanName);
        return bean;
    }

}
