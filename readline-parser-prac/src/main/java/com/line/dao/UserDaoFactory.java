package com.line.dao;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {

    @Bean
    public UserDao awsUserDao() {
        DBConnection connA = new DBConnectionA();
        UserDao udao = new UserDao(connA);
        return udao;
    }

    @Bean
    public UserDao loocalUserDao() {
        UserDao udao = new UserDao(new LocalConnection());
        return udao;
    }
}
