package com.jsp_jdbc_prepared_statement_crud_employeelaptop_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp_jdbc_prepared_statement_crud_employeelaptop.Employee;

public class EmployeeLaptopDao {
	// here we are creating the insertEmployeeLaptop method to insert the data
	public void insertEmployeeLaptop(Employee employee) {

		Connection connection = null;
		try { // step-1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/employee~laptop~jdbc";
			String username = "root";
			String password = "Vishesh@123";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using preparedStatement instead of Statement so the normal flow
			 * of program will be diverted.
			 */
			String insertLaptop = "insert into laptop values(?,?,?,?)";
			String insertEmployee = "insert into employee values(?,?,?,?)";
			// step-3 create statement(Laptop)
			PreparedStatement preparedStatement = connection.prepareStatement(insertLaptop);
			preparedStatement.setInt(1, employee.getLaptop().getLaptopSerialNumber());
			preparedStatement.setString(2, employee.getLaptop().getLaptopName() );
			preparedStatement.setString(3, employee.getLaptop().getLaptopMemory());
			preparedStatement.setDouble(4, employee.getLaptop().getLaptopPrice());

			// step-4 execute query(Laptop)
			preparedStatement.execute();
			System.out.println("laptop data inserted");

			// step-3 create statement(Employee)
			PreparedStatement preparedStatement1 = connection.prepareStatement(insertEmployee);
			preparedStatement1.setInt(1, employee.getEmployeeId());
			preparedStatement1.setString(2, employee.getEmployeeName());
			preparedStatement1.setString(3, employee.getEmployeeEmail());
			preparedStatement1.setInt(4, employee.getLaptop().getLaptopSerialNumber());

			// step-4 execute query(Employee)
			preparedStatement1.execute();
			System.out.println("employee data inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// step-5 close the connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
