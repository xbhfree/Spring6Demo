package org.example.reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * 反射类测试
 */
public class TestCar {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获取Class对象的多种方式
        //1.1 类名.class
        Class<Car> carClass = Car.class;
        //1.2 类对象.getClass()
        Class carClass2 = new Car().getClass();
        //1.3 Class.forName("全路径")
        Class carClass3 = Class.forName("org.example.reflect.Car");

        Car car = (Car)carClass3.getDeclaredConstructor().newInstance();
        System.out.println(car);
        //2.获取构造方法

        //3.获取属性

        //4.获取方法
    }
}
