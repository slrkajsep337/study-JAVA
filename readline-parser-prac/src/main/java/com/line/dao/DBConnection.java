package com.line.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBConnection {

    Connection getConnection() throws ClassNotFoundException, SQLException;
}
