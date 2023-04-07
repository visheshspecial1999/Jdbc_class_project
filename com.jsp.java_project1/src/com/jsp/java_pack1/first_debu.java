package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class first_debu {

	public static void main(String[] args) {
		try {
			// step-1 Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step-2 create the connection
			String url = "jdbc:mysql://localhost:3306/debu1";
			String username = "root";
			String password = "Vishesh@123";
			
			//step-3 create statement
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement= connection.createStatement();
			// System.out.println(connection);
			//step-4 Execute the query
			String insert = "insert into celebrities values(003,'tapsipannu','1989-09-27',813245637482,'1999-08-19','035 thomas towan silver street Londen UK')";
			
			statement.execute(insert);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
