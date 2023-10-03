package org.example;

import org.example.reflect.Car;

import java.lang.reflect.Field;

/**
 * Hello world!
 *
 */
public class App 
{
    private String a = "sss";
    Car car = null;
    public static void main( String[] args )
    {
        Class<?> claszz = App.class;
        Field[] declaredFields = claszz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getType());
        }
    }
}
