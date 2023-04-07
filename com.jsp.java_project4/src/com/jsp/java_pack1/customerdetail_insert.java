package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class customerdetail_insert {

	public static void main(String[] args) {
		
		try
		{
		// step-1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		// step-2 create connection
		String url="jdbc:mysql://localhost:3306/customerdata";
		String username="root";
		String password="Vishesh@123";
		Connection connection=DriverManager.getConnection(url,username,password);
		
		// step-3 create statement 
		Statement statement=connection.createStatement();
		
		// step-4 execute query
		String insert="insert into premiumcustomer values(34629,'Jhon',22,32543454433,10000000)";
		statement.execute(insert);
		System.out.println("data........inserted");
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
