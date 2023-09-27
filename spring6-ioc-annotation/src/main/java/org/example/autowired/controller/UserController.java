package org.example.autowired.controller;

import org.example.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //第1种，属性注入
    /*@Autowired
    private UserService userService;*/

    //第2种，set注入
    /*private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    //第3种，构造注入
    /*private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }*/

    //第4种，形参注入
   /* private UserService userService;
    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }*/

    //第5种，只有一个构造方法，省略注解注入
    /*private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }*/

    //第6种，autowired+qualifier根据名称注入
    @Autowired
    @Qualifier(value = "userRedisServiceImpl")
    private UserService userService;

    public void add(){
        System.out.println("add controller...");
        userService.add();
    }
}
