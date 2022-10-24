package com.line.dao;

import com.line.dao.domain.JdbcContext;
import com.line.dao.domain.User;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//1. gradle 프로젝트(모듈) 생성
//2. MySql에 자바 코드와 연동할 스키마와 테이블 생성
//3. 전체 코드 실행후 -> Edit Configurations 환경변수에 host, user, password 설정해주기
// -> 보안을 유지하기 위한 방식이다. 코드에 password까지 모두 넣으면 해킹당함


public class UserDao {

//    private DBConnection dbc;

    private final DataSource ds;
    private final JdbcContext jdbcContext;
    //UserDao가 이제는 jdbcContext에 의존하도록 의존관계가 바뀜

    public UserDao(DataSource ds) {
        this.ds = ds;
        this.jdbcContext = new JdbcContext(ds);
    }


    //final ? 한번 초기화되면 바꿀 수 없음, 불변 -> final로 사용할 수 있다면 최대한 final로 사용하는 것이 좋다
    //DI를 할 때 final 을 사용하는 이유? 장점 ?
    //1. 무조건 불변이기 때문에 변화를 생각하며 코드를 짜주지 않아도 된다
    //2. 값이 변할 여지가 없기 때문에 값이 변하는데 필요한 부가적인 메모리 할당이 필요없다 -> 메모리
    //3. DI하고나서 DataSource가 바뀌는 경우 - 무슨일이 일어날지 예측이 되지 않기 때문에 final 사용
    //4. 스프링에서 DI가 되었다는 것은 이미 Factory에서 조립이 끝났다는 의미이다
    //결론 -> 변화하지 않는게 좋으므로 final을 사용한다 + 신뢰성
    public void add(final User user) throws SQLException {
        //익명함수로 만들기 -> 익명내부클래스는 구현하는 인터페이스를 생성자처럼 이용해서 오브젝트로 만든다
        jdbcContext.workWithStatementStrategy(new StatementStrategy() {
            public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
                PreparedStatement ps =  c.prepareStatement("INSERT INTO users(id,name,password) VALUES(?,?,?)");
                ps.setString(1,user.getId());
                ps.setString(2,user.getName());
                ps.setString(3,user.getPassword());

                return ps;
            }
        });
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
        jdbcContext.workWithStatementStrategy(new StatementStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection connection) throws SQLException {
                return connection.prepareStatement("delete from users");
            }
        });
    }

    public int getCount() throws SQLException {
        Connection conn = ds.getConnection();
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