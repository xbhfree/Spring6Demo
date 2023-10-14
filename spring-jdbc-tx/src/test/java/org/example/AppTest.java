package org.example;

import jakarta.annotation.Resource;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.tx.controller.UserController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Unit test for simple App.
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class AppTest{
    @Autowired
    private UserController userController;
    @Test
    public void buyBook(){
        userController.buyBook(1, 1);
    }
}
