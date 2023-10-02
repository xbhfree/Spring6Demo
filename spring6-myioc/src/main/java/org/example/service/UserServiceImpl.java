package org.example.service;

import org.example.anno.Bean;

@Bean
public class UserServiceImpl implements UserService{
    @Override
    public void run() {
        System.out.println("user service run...");
    }
}
