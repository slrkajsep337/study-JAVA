package com.line.dao;

import com.line.dao.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//1. gradle 프로젝트(모듈) 생성
//2. MySql에 자바 코드와 연동할 스키마와 테이블 생성
//3. 전체 코드 실행후 -> Edit Configurations 환경변수에 host, user, password 설정해주기
// -> 보안을 유지하기 위한 방식이다. 코드에 password까지 모두 넣으면 해킹당함


public class UserDao {
    public void add() throws SQLException, ClassNotFoundException {
        //system의 환경변수(environment)값을 가져와서 Key, valuer 값으로 넣음
        Map<String, String> env = System.getenv();
        //key에 해당하는 각 value 값을 변수에 넣음
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        //드라이버를 메모리에 로딩하는 과정. 생략 가능
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword); //mysql db와 연결
        //쿼리문 끝에 세미콜론 작성하지 않음, 변수값은 물음표로 처리 -> Java Injection 해킹 방지 목적 (컬럼명과 테이블명은 물음표로 처리할 수 없음.)
        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(id, name, password) VALUES (?,?,?)"
        );
        //DB에 물음표 값을 전송하는 과정. 인덱스 번호는 물음표의 순서대로 자동 지정, 인덱스 번호는 1번부터 시작
        ps.setString(1, "idtest");
        ps.setString(2, "nametest");
        ps.setString(3, "pwtest");

        int status = ps.executeUpdate(); //상태 확인
        //insert, update, delete는 실행 결과로 int를 리턴,
        //1개의 행이 insert, update, delete 성공하면 1 리턴, 실패하면 0리턴
        System.out.println(status);
        //연결된 역순으로 연결 해제
        ps.close();
        conn.close();

    }

    //user 하나의 정보만 가져오는 메소드
    public User get(String id) throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword); //mysql db와 연결
        PreparedStatement ps = conn.prepareStatement(
                "SELECT id, name, password FROM users WHERE id = ?");

        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User(rs.getString("id"),
                rs.getString("name"), rs.getString("password"));

        rs.close();
        ps.close();
        conn.close();

        return user;

    }

    //모든 user를 가져오는 메소드
    public List<User> getUserAll() throws SQLException, ClassNotFoundException {
        DBConnection db = new DBConnection();

        PreparedStatement ps = db.makeConnection().prepareStatement("SELECT * FROM users");
        ResultSet rs = ps.executeQuery();

        List<User> userList = new ArrayList<>();
        while (rs.next()) {
            User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
            userList.add(user);
        }

        return userList;
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao udao = new UserDao();
//        udao.add();

//        User user = udao.get("idtest");
//        System.out.println(user.getName());

        List<User> userList = new ArrayList<>();
        userList = udao.getUserAll();

        for (User user: userList) {
            System.out.println(user.getName());
            System.out.println(user.getId());
            System.out.println(user.getPassword());

        }

    }
}