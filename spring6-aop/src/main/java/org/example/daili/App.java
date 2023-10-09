package org.example.daili;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator)proxyFactory.getProxy();
        Integer res = proxy.sub(1, 2);
        System.out.println("app res = " + res);

        //动态代理只能通过接口定义使用，可多接口使用
        TimeDemo proxy2 = (TimeDemo)proxyFactory.getProxy();
        proxy2.showTime();
    }
}
