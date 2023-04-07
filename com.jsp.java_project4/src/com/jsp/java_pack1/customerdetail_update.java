package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class customerdetail_update {

	public static void main(String[] args) {
		try {
		
		// step-1 load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step-2 create connection
		String url="jdbc:mysql://localhost:3306/customerdata";
		String username="root";
		String password="Vishesh@123";
		Connection connection= DriverManager.getConnection(url, username, password);
		
		// step-3 create statement
		Statement statement= connection.createStatement();
		
		// step-4 execute query
		String update="update premiumcustomer set name='Anshika',age=24,phone=5566778899 where Id=67368";
		statement.executeUpdate(update);
		System.out.println("data........updated successfully");
		}
	catch(ClassNotFoundException | SQLException e)
		{
		e.printStackTrace();
		}
	}

}
