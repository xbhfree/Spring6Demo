package org.example.dao;

import org.example.anno.Bean;

@Bean
public class UserDaoImpl2 implements UserDao{
    @Override
    public void run() {
        System.out.println("user dao222 run ...");
    }
}