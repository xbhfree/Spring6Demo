package com.spring6.iocxml.di;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
/**
 *  部门类
 */
public class Department {
    private String dname;

    private List<Employee> employeeList = null;

    //部门藏书
    private List<Book> bookList;

    private Map<String, Employee> employeeMap;

    public void info(){
        System.out.println("部门名称：" + dname);
        if (employeeList != null) {
            employeeList.stream().forEach(System.out::println);
        }
        System.out.println(employeeMap.toString());
        if (bookList != null) {
            bookList.stream().forEach(System.out::println);
        }
    }
}
