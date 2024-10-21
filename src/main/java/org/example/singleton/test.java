package org.example.singleton;

import java.sql.Connection;

public class test {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        Connection connection = dbConnection.getConnection();

        if(connection != null) {
            System.out.println("sukses koneksi ke database");
        }else{
            System.out.println("gagal koneksi ke database");
        }
    }
}
