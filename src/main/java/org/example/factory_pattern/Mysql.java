package org.example.factory_pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql implements Database{

    private String dsn;

    public Mysql(String dsn){
        this.dsn = dsn;
    }
    @Override
    public Connection connection() throws SQLException {
        return DriverManager.getConnection(dsn, "root", "");
    }
}
