package database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

	private static final String db="agenda";
	private static final String user="agenda";
	private static final String pass="agenda1";
	private static final String url="jdbc:mysql://localhost:3306/"+db;
	private static Connection Conn;
	
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Conn = DriverManager.getConnection(url,user,pass);
		} catch(ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
		}
		return Conn;
	}
}
