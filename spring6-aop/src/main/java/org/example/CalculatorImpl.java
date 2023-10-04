package org.example;

import java.util.Date;

public class CalculatorImpl implements Calculator, TimeDemo{

    @Override
    public int add(int x, int y) {
        int result = x + y;
        System.out.println("add result = " + result);
        return result;
    }

    @Override
    public int sub(int x, int y) {
        int result = x - y;
        System.out.println("sub result = " + result);
        return result;
    }

    @Override
    public void showTime() {
        System.out.println("现在的时间是" + new Date());
    }
}
