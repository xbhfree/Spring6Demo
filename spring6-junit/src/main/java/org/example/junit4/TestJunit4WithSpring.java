package org.example.junit4;

import org.example.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class TestJunit4WithSpring {


    @Autowired
    private User user;

    @Test
    public void userRunTest(){
        user.run();
    }
}
