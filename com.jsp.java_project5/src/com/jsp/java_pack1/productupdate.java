package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class productupdate {
	public static void main(String [] args)
	{
		
		try {
	// step-1 load driver
	Class.forName("com.mysql.cj.jdbc.Driver");

	// step-2 create connection
	String url = "jdbc:mysql://localhost:3306/productdata";
	String username = "root";
	String password = "Vishesh@123";
	Connection connection = DriverManager.getConnection(url, username, password);

	// step-3 create statement
	Statement statement = connection.createStatement();

	// step-4 execute query
	String update = "update newproduct set price=900000, discount=16.68 where productId=5221";
	int id= statement.executeUpdate(update);
	if(id!=0)
	{
		System.out.println("data.......updated");
	}

	else
	{
		System.out.println("data........updation faild");
	}
	
		}
		
	catch(ClassNotFoundException | SQLException e)
		{
		e.printStackTrace();
		}
}
}
