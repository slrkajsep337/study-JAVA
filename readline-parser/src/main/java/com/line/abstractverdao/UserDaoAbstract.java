package com.line.abstractverdao;

import com.line.dao.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

//
public abstract class UserDaoAbstract {

    public abstract Connection getConnection() throws SQLException, ClassNotFoundException;

    public void add(User user) throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();

        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(id, name, password) VALUE(?,?,?)"
        );

        ps.setString(1,user.getId());
        ps.setString(2,user.getName());
        ps.setString(3,user.getPassword());

        ps.executeUpdate();

        ps.close();
        conn.close();
    }

    public User select(String id) throws ClassNotFoundException, SQLException {

        Connection conn = getConnection();

        PreparedStatement ps = conn.prepareStatement(
                "SELECT id, name, password FROM users WHERE id = ?"
        );

        ps.setString(1,id);

        ResultSet rs = ps.executeQuery();
        rs.next();

        User user = new User(rs.getString("id"),rs.getString("name"),rs.getString("password"));

        return user;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {



    }


}
