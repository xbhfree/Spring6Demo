package org.example;

public class CalculatorLogImpl implements Calculator{
    @Override
    public int add(int x, int y) {
        System.out.println("add log start... x = " + x + ",y = " + y);
        int result = x + y;
        System.out.println("add result = " + result);
        System.out.println("add log end... result = " + result);
        return result;
    }

    @Override
    public int sub(int x, int y) {
        System.out.println("sub log start... x = " + x + ",y = " + y);
        int result = x - y;
        System.out.println("sub result = " + result);
        System.out.println("sub log end... result = " + result);
        return result;
    }
}
