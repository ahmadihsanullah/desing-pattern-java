package org.example.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;

    private DatabaseConnection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/elemuba", "root","");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }

    Connection getConnection(){
        return connection;
    }
}
