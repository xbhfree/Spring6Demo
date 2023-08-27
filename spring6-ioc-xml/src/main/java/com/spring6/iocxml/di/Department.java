package com.spring6.iocxml.di;

import lombok.Data;

import java.util.List;

@Data
/**
 *  部门类
 */
public class Department {
    private String dname;

    private List<Employee> employeeList;

    public void info(){
        System.out.println("部门名称：" + dname);
        employeeList.stream().forEach(System.out::println);
    }
}
