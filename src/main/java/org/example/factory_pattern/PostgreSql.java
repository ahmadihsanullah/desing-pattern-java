package org.example.factory_pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSql implements Database {

    private String dsn;

    public PostgreSql(String dsn){
        this.dsn = dsn;
    }
    @Override
    public Connection connection() throws SQLException {
        return DriverManager.getConnection(dsn, "root", "");
    }
}
