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

    private DBConnection dbc;

    public UserDao(DBConnection dbconnection) {
        this.dbc = dbconnection;
    }

    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            conn = dbc.getConnection();
            ps = stmt.makePreparedStatement(conn);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            if(ps != null) {
                try {
                    ps.close();
                } catch(SQLException e) {
                }
            }
            if( conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    public void add(User user) throws SQLException {
        AddStrategy as = new AddStrategy(user);
        jdbcContextWithStatementStrategy(as);
    }

//    public void add(User user) {
//
//        Map<String, String> env = System.getenv();
//        try{
//            Connection conn = dbc.getConnection();
//
//            //쿼리를 작성할 때 사용하는 클래스 - PreparedStatement
//            //쿼리문 끝에 세미콜론 작성하지 않음, 변수값은 물음표로 처리 -> Java Injection 해킹 방지 목적 (컬럼명과 테이블명은 물음표로 처리할 수 없음.)
//            PreparedStatement ps = conn.prepareStatement(
//                    "INSERT INTO users(id, name, password) VALUES (?,?,?)");
//            ps.setString(1,user.getId());
//            ps.setString(2,user.getName());
//            ps.setString(3,user.getPassword());
//
//            ps.executeUpdate(); //위에 작성한 쿼리문 실행
//            //insert, update, delete는 실행 결과로 int를 리턴,
//            //1개의 행이 insert, update, delete 성공하면 1 리턴, 실패하면 0리턴
//            //연결된 역순으로 연결 해제
//            ps.close();
//            conn.close();
//            } catch(SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    //user 하나의 정보만 가져오는 메소드
    public User FindById(String id) throws ClassNotFoundException, SQLException {

//        Connection conn = dbconnection.getConnection();
        Map<String, String> env = System.getenv();
        //key에 해당하는 각 value 값을 변수에 넣음
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        //드라이버를 메모리에 로딩하는 과정. 생략 가능
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword); //mysql db와 연결

        //id로 값을 찾는 쿼리문 넣어주기
        PreparedStatement ps = conn.prepareStatement(
                "SELECT id, name, password FROM users WHERE id = ?");

        ps.setString(1, id);  //(??????
        ResultSet rs = ps.executeQuery();

        //다음에 읽어올게 더 있는지 없는지 확인
        rs.next();
        User user = new User(rs.getString("id"),
                rs.getString("name"), rs.getString("password"));

        rs.close();
        ps.close();
        conn.close();

        return user;

    }

    public void deleteAll() throws SQLException {
        jdbcContextWithStatementStrategy(new DeleteAllStrategy());
    }

    public int getCount() throws SQLException {
        Connection conn = dbc.getConnection();
        PreparedStatement ps = conn.prepareStatement("select count(*) from users");
        ResultSet rs = ps.executeQuery();
        rs.next();
        int cnt = rs.getInt(1);

        rs.close();
        ps.close();
        conn.close();

        return cnt;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        //new DB~ 넣어서 db 연결하기
//        UserDao udao = new UserDao(new DBConnectionA());
//        UserDao udao = new UserDao();


//        udao.add(new User("4","도랄라","pw123"));
        //User user = userDao.select("21");
//        udao.delete("22");

    }
}