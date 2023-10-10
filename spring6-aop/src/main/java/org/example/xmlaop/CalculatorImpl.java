package org.example.xmlaop;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {

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
    public float div(float x, float y) {
        //int a = 1/0;
        return x/y;
    }
}
