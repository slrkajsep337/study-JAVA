package com.line.dao;

import com.line.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    DBConnection dbconnection;

    public UserDao(DBConnection dbconnection) {
        this.dbconnection = dbconnection;
    }

    public void add(User user) throws SQLException, ClassNotFoundException {
        Connection conn = dbconnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(id, name, password) VALUES(?, ?, ?)"
        );
        ps.setString(1, user.getId());
        ps.setString(2, user.getUser());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();

        ps.close();
        conn.close();

    }

    public User FindById(String id) throws SQLException, ClassNotFoundException {

        Connection conn = dbconnection.getConnection();

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

    public static void main(String[] args) {

    }


}
