package org.example.tx.controller;

import org.example.tx.service.CheckService;
import org.example.tx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private CheckService checkService;
    //买书
    public void buyBook(Integer bookId, Integer userId){
        userService.buyBook(bookId, userId);
    }

    //买多本书，测试事物的传播行为
    public void buyBooks(Integer[] bookIds, Integer userId){
        checkService.buyBooks(bookIds, userId);
    }
}
