package com.line.dao;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {

    @Bean
    public UserDao awsUserDao() {
        DBConnectionA connA = new DBConnectionA();
        UserDao udao = new UserDao(connA);
        return udao;
    }

    @Bean
    public UserDao localUerDao() {
        UserDao udao = new UserDao(new LocalConnection());
        return udao;

    }
}
