package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class studentdelete_130 {

	public static void main(String[] args) {
		try {
		
			// step-1 create statement
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// step-2 create connection
		String url="jdbc:mysql://localhost:3306/student130";
		String username="root";
		String password="Vishesh@123";
		
		// step-3 create statement
		Connection connection=DriverManager.getConnection(url, username, password);
		Statement statement= connection.createStatement();
		 
		 // step-4 execute query
		 String delete="delete from studentdetails130 where Id=5864";
		 int id=statement.executeUpdate(delete);
		 if(id!=0)
		 {
			 System.out.println("Data........ deleted");
		 }
		 else
		 {
			 System.out.println("invalid id please try again");
		 }
		}
		 
		 catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		 
		 }
	}