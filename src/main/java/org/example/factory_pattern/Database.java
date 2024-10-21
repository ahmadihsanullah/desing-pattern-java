package org.example.factory_pattern;

import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
    Connection connection() throws SQLException;
}
