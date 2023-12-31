package com.spring6.iocxml.di;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
/**
 * 雇员类
 */
public class Employee {
    private String ename;

    private Integer age;

    //员工属于某一个部门
    private Department department;

    //员工爱好
    private String[] hobbies;

    public void work(){
        System.out.println(ename + " age is " + age + ",department is " + department.getDname() + ",hobbies is ");
        Arrays.stream(hobbies).forEach(System.out::println);
    }
}
