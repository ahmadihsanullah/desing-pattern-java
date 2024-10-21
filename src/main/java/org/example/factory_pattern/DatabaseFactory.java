package org.example.factory_pattern;

public class DatabaseFactory {
    public static Database getDatabase(String dbType, String dsn){
        return switch (dbType) {
            case "mysql" -> new Mysql(dsn);
            case "postgresql" -> new PostgreSql(dsn);
            default -> throw new IllegalArgumentException("Tipe database tidak dikenal");
        };
    }
}
