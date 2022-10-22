package com.line.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class DBConnectionA implements  DBConnection{
    @Override
    public Connection getConnection() throws SQLException {

        //system의 환경변수(environment)값을 가져와서 Key, valuer 값으로 넣음
        Map<String, String> env = System.getenv();
        //드라이버를 메모리에 로딩하는 과정. 생략 가능
        //Class.forName("com.mysql.cj.jdbc.Driver");


        //mysql db와 연결
        Connection conn = DriverManager.getConnection(env.get("DB_HOST"),env.get("DB_USER"), env.get("DB_PASSWORD"));



        return conn;
    }
}
