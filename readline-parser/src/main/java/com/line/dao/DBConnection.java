package com.line.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public interface DBConnection {

    Connection getConnection() throws ClassNotFoundException, SQLException;
}
