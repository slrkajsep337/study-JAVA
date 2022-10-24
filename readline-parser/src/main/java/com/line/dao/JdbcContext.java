package com.line.dao;

import com.line.dao.StatementStrategy;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcContext {
    //특별히 어디에 종속되지 않음 -> 다른걸 개발할 때(다른 Dao)에도 필요하면 가져다 사용할 수 있다.
    private DataSource ds;
    //datasource의 종속성이 dataSource에 있기 때문에 constructor를 만들어준다.

    public JdbcContext(DataSource ds) {
        this.ds = ds;
    }

    public void workWithStatementStrategy(StatementStrategy stmt) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            conn = ds.getConnection();
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


}
