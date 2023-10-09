package org.example.annoaop;

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
}
