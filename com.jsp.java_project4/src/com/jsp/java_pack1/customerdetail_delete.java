package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class customerdetail_delete {
	public static void main(String[] args) 
	
	{
		try
		{
		
		// step-1 load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step-2 create connection
		String url="jdbc:mysql://localhost:3306/customerdata";
		String usrename="root";
		String password="Vishesh@123";
		Connection connection= DriverManager.getConnection(url, usrename, password);
		
		// step-3 create statement
		Statement statement= connection.createStatement();
		
		// step-4 execute query
		String delete="delete FROM premiumcustomer where Id=67368";
		int id=statement.executeUpdate(delete);
		if(id!=0)
		{
			System.out.println("data.....deleted successfully");
		}
		else
		{
			System.out.println("id not found please try again");
		}
		
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}		
	}
}
