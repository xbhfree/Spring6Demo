package org.example.dao;

import org.example.anno.Bean;

@Bean
public class UserDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("user dao run ...");
    }
}
