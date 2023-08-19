package com.spring6.iocxml.di;

import lombok.Data;

@Data
/**
 * 雇员类
 */
public class Employee {
    private String ename;

    private Integer age;

    //员工属于某一个部门
    private Department department;

    public void work(){
        System.out.println(ename + " age is " + age + ",department is " + department.getDname());
    }
}
