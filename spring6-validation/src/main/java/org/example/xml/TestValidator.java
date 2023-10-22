package org.example.xml;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

public class TestValidator {
    public static void main(String[] args) {
        //创建对象
        User user = new User();
        user.setName("alisa");
        user.setAge(-1);
        //创建对象对应的databinder
        DataBinder dataBinder = new DataBinder(user);
        //设置校验器
        dataBinder.setValidator(new UserValidator());
        //执行校验
        dataBinder.validate();
        //输出结果
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println(bindingResult);
    }
}
