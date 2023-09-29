package org.example.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射类测试
 */
public class TestCar {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获取Class对象的多种方式
        //1.1 类名.class
        Class<Car> carClass = Car.class;
        //1.2 类对象.getClass()
        //Class carClass2 = new Car().getClass();
        //1.3 Class.forName("全路径")
        //Class carClass3 = Class.forName("org.example.reflect.Car");

        //Declared 宣布
        //Car car = (Car)carClass3.getDeclaredConstructor().newInstance();
        //System.out.println(car);

        //2.获取构造方法
        //2.1获取所有共有构造方法
        //Constructor<?>[] constructors = carClass.getConstructors();
        //2.2获取所有构造方法public private
        //Constructor<?>[] declaredConstructors = carClass.getDeclaredConstructors();
        //2.3 只获取有参构造方法
        //2.3.1 只获取共有有参构造方法
        //Constructor<Car> constructor = carClass.getConstructor(String.class, int.class, String.class);
        //2.3.1 只获取有参构造方法,私有方法也适用
        Constructor<Car> declaredConstructor = carClass.getDeclaredConstructor(String.class, int.class, String.class);
        //Accessible 可访问的
        declaredConstructor.setAccessible(true);
        Car car2 = declaredConstructor.newInstance("tesla", 2, "red");
        System.out.println(car2);
        //3.获取属性
        //3.1 获取公有属性
        //Field[] fields = carClass.getFields();
        //3.2 获取所有属性
        Field[] declaredFields = carClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getName().equals("name")){
                field.setAccessible(true);
                field.set(car2, "bmw");
            }
        }
        System.out.println(car2);

        //4.获取方法
        //4.1 获取共有方法
        //Method[] methods = carClass.getMethods();
        //4.2 获取所有方法
        Method[] declaredMethods = carClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().equals("run")){
                declaredMethod.setAccessible(true);
                //invoke 调用
                declaredMethod.invoke(car2);
            }
        }
    }
}
