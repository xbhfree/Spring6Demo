package org.example.tx;


import org.example.tx.config.TxConfig;
import org.example.tx.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookTxTestWithAnno {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserController userController = context.getBean(UserController.class);
        Integer[] bookIds = {1, 2};
        userController.buyBooks(bookIds, 1);
    }
}
