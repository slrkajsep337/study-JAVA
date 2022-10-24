package com.line.dao;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class UserDaoFactory {

    //Factory 패턴 적용 :  Factory 패턴을 항상 사용하는 것이 좋은 것은 아니다, 적재적소에 사용해야함
    // -> factory interface를 생성하고 틀이 비슷한 여러개의 object를 가져와 디테일한 부분만 바꾸어 사용
    //지금 이 클래스에서 그 각각의 object를 가져와 조립하는 역할을 한다

    @Bean
    UserDao awsUserDao() {
        return new UserDao(awsDataSource());
    }

    @Bean
    UserDao localUserDao() {
        return new UserDao(localDataSource());
    }


    @Bean
    DataSource awsDataSource() {
        Map<String, String> env = System.getenv();
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl(env.get("DB_HOST"));
        dataSource.setUsername(env.get("DB_USER"));
        dataSource.setPassword(env.get("DB_PASSWORD"));
        return dataSource;
    }
    @Bean
    DataSource localDataSource() {
        Map<String, String> env = System.getenv();
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("localhost");
        dataSource.setUsername("root");
        dataSource.setPassword("12345678");
        return dataSource;
    }

    }
