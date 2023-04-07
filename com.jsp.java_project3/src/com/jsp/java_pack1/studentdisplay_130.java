package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class studentdisplay_130 {

	public static void main(String[] args) {
		
		
		try {
			//step-1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");	
		
		//step-2 create connection
		String url="jdbc:mysql://localhost:3306/student130";
		String username="root";
		String password="Vishesh@123";
		
		//step-3 create statement
		Connection connection=DriverManager.getConnection(url, username, password);
		Statement statement=connection.createStatement();
		
		//step-4 execute query
		String select="select * From studentdetails130";
		ResultSet set=statement.executeQuery(select);
		System.out.println("====Student130 table====");
		System.out.println("Id         name             email");
		while(set.next()) {
		int id=set.getInt("Id");
		String name=set.getString("name");
		String email=set.getString("email");
		System.out.print(id+"   ");
		System.out.print(name+"     ");
		System.out.println(email);
		System.out.println();
		}
		System.out.println("==========================================End of table130...");
		}
		catch (ClassNotFoundException |SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	}


