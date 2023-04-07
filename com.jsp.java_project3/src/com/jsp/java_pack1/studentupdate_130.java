package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class studentupdate_130 {

	public static void main(String[] args) {
		 
		try {
			
			// step-1 create connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step-2 create connection
			String url="jdbc:mysql://localhost:3306/student130";
			String username="root";
			String password="Vishesh@123";
			
			// step-3 create statement
			Connection connection= DriverManager.getConnection(url, username, password);
			Statement statement= connection.createStatement();
			// step-4 Execute query
			String update="update studentdetails130 set email='visheshspecial1999@bbdnitm.ac.in' where Id=05862";
			
			int id=statement.executeUpdate(update);
			if(id!=0)
			{
				System.out.println("data......updated");
				System.out.println(id);
			}
			else
			{
				System.out.println("given id with where clause is not present in table");
				System.out.println(id);
			}
			
			
			
		} catch (ClassNotFoundException  | SQLException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
