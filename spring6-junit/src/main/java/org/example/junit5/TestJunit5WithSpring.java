package org.example.junit5;

import org.example.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:bean.xml")
//@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestJunit5WithSpring {

    @Autowired
    private User user;

    @Test
    public void userRunTest(){
        user.run();
    }
}
