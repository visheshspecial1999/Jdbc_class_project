package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class productinsert {

	public static void main(String[] args) {
		
		// step-1 load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// step-2 create connection
		String url="jdbc:mysql://localhost:3306/productdata";
		String username="root";
		String password="Vishesh@123";
		Connection connection= DriverManager.getConnection(url, username, password);
		
		// step-3 create statement
		Statement statement= connection.createStatement();
		
		// step-4 execute query
		String insert="insert into newproduct values(98876,445547,15.0,54234598767,90898788)";
		statement.execute(insert); 
		System.out.println("data.........inserted");
		
		} catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
