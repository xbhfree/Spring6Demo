package org.example.resource.controller;

import jakarta.annotation.Resource;
import org.example.resource.service.UserService;
import org.springframework.stereotype.Controller;
//同一父包下，多个名称重复的类，可以通过加命名区分
@Controller("ReController")
public class UserController {

    //第1种，根据名称注入
    /*@Resource(name = "reUserServiceImpl")
    private UserService userService;*/

    //第2种，set注入
    /*private UserService userService;
    @Resource(name = "reUserServiceImpl")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    //第3种，类型注入
    @Resource
    private UserService userService;

    public void add(){
        System.out.println("re add controller...");
        userService.add();
    }
}
