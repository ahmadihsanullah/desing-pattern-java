package org.example.factory_pattern;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String dbType = "mysql";
        String dsn = "jdbc:mysql://localhost:3306/elemuba";

        Database db = DatabaseFactory.getDatabase(dbType, dsn);
        try(Connection conn = db.connection()){
            System.out.println("berhasil terkoneksi");
        }catch (SQLException e){
            System.out.println("gagal terkoneksi " + e.getMessage());
        }
    }
}
