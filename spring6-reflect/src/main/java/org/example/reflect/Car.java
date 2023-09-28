package org.example.reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String name;

    private int age;

    private String color;

    public void run(){
        System.out.println("私有方法。。。");
    }

}
