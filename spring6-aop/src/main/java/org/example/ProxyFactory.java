package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 动态代理demo
 */
public class ProxyFactory {
    //目标对象，被代理“套用”了非核心逻辑代码的类，对象，方法
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回代理对象
    public Object getProxy(){
        /**
         * Proxy.newProxyInstance()
         * 有三个参数
         * 1. ClassLoader：加载动态生成代理类的加载器
         * 2. Class[] interfaces：目标对象实现的所有接口的class类型数组
         * 3. InvocationHandler：设置代理对象实现目标对象方法的过程
         */
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            /**
             * @param proxy 代理对象
             * @param proxy the proxy instance that the method was invoked on
             *
             * @param method 需要重写目标对象的方法
             * @param method the {@code Method} instance corresponding to
             * the interface method invoked on the proxy instance.  The declaring
             * class of the {@code Method} object will be the interface that
             * the method was declared in, which may be a superinterface of the
             * proxy interface that the proxy class inherits the method through.
             *
             * @param args method方法里面的参数
             * @param args an array of objects containing the values of the
             * arguments passed in the method invocation on the proxy instance,
             * or {@code null} if interface method takes no arguments.
             * Arguments of primitive types are wrapped in instances of the
             * appropriate primitive wrapper class, such as
             * {@code java.lang.Integer} or {@code java.lang.Boolean}.
             *
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理日志start..." + method.getName() + ",参数：" + Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println("动态代理日志end..." + method.getName() + ",结果：" + result);
                //result 即是getProxy()的值
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
