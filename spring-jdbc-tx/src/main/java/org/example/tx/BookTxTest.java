package org.example.tx;

import org.example.tx.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class BookTxTest {
    @Autowired
    private UserController userController;

    @Test
    public void testBuyBook(){
        userController.buyBook(1,1);
    }

}
