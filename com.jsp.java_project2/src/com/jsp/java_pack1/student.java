package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class student {

	public static void main(String[] args) {
		try {// Step-1 Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 create the connection
			String url="jdbc:mysql://localhost:3306/basic~jdbc";
			String username="root";
			String password="Vishesh@123";
			try {
				
				//step-3 create statement
				Connection connection= DriverManager.getConnection(url, username, password);
				
				 //step-4 Execute the query
				String insert="insert into stutable values(123,'vishesh kumar',1255234)";
				Statement statement= connection.createStatement();
				statement.execute(insert);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
