package com.line.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class LocalConnection implements DBConnection{

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        return null;
    }

}
