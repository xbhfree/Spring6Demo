package org.example.daili;

/**
 * 静态代理demo
 */
public class CalculatorStaticProxy implements Calculator{

    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int x, int y) {
        //日志
        System.out.println("add log start... x = " + x + ",y = " + y);
        //调用目标方法，实现核心逻辑
        int result = calculator.add(x, y);
        System.out.println("add log end... result = " + result);
        return result;
    }

    @Override
    public int sub(int x, int y) {
        System.out.println("sub log start... x = " + x + ",y = " + y);
        int result = calculator.sub(x, y);
        System.out.println("sub log end... result = " + result);
        return result;
    }
}
