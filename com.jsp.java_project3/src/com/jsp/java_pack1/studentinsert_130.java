package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class studentinsert_130 {

	public static void main(String[] args) {
		// step-1 Load the connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create the connection
			String url = "jdbc:mysql://localhost:3306/student130";
			String username = "root";
			String password = "Vishesh@123";

			// step-3 create statements
			Connection connection = DriverManager.getConnection(url, username, password);
			
			// step-4 Execute the query
			String insert="insert into studentdetails130 values(05864,'Ashish gupta','ashish29394@gmail.com')";
			Statement statement= connection.createStatement();
			statement.execute(insert);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
