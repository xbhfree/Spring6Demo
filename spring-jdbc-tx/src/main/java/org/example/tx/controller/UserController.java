package org.example.tx.controller;

import org.example.tx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //买书
    public void buyBook(Integer bookId, Integer userId){
        userService.buyBook(bookId, userId);
    }
}
