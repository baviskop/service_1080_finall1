package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String url = "jdbc:mysql://localhost:3306/service_1080_finall";
	private static final String user = "root";
	private static final String password = "";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
}
