package com.jsp.jdbc_statement_crud_operation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc_statement_crud_operation.dto.Teacher;

/* 
 * this class belongs to database communication
 */
public class TeacherDao {

	/*
	 * insert method of teacher where we are going to insert id name email and
	 * subject
	 */
	public void insertTeacher(Teacher teacher) {
		Connection connection = null;
		try {
			// step-1 load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/student130";
			String username = "root";
			String password = "Vishesh@123";
			connection = DriverManager.getConnection(url, username, password);

			// step-3 create statement
			Statement statement = connection.createStatement();

			// step-4 execute query
			String insert = "insert into teacherdetails130 values(" + teacher.getTeacherId() + ",'"
					+ teacher.getTeacherName() + "','" + teacher.getTeacherEmail() + "','" + teacher.getTeacherSubject()
					+ "')";

			statement.execute(insert);

			System.out.println("inserted successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// step-5 close the connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * creating GetbyId method
	 */
	public void getById(int id) {
		Connection connection = null;
		int id1 = 0;
		try {
			// step-1 load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/student130";
			String username = "root";
			String password = "Vishesh@123";
			connection = DriverManager.getConnection(url, username, password);

			// step-3 create statement
			Statement statement = connection.createStatement();

			// step-4 execute query
			String update = "update teacherdetails130 set teacherSubject='CSE' where teacherId=" + id + "";
			id1 = statement.executeUpdate(update);
			if (id1 != 0) {
				String select = "select * from teacherdetails130 where teacherId=" + id + "";
				ResultSet resultSet = statement.executeQuery(select);

				while (resultSet.next()) {
					id1 = resultSet.getInt("teacherId");

					{
						System.out.println("teacherId=" + resultSet.getInt("teacherId"));
						System.out.println("teacherName=" + resultSet.getString("teacherName"));
						System.out.println("teacherEmail=" + resultSet.getString("teacherEmail"));
						System.out.println("teacherSubject=" + resultSet.getString("teacherSubject"));
					}
				}
			} else {
				System.out.println("id is not present in database");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//	return id1;
	}

	/*
	 * delete teacher data by entering teacher Id
	 */
	public void deleteById(int id) {
		Connection connection = null;
		try {

			// step-1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/student130";
			String username = "root";
			String password = "Vishesh@123";
			connection = DriverManager.getConnection(url, username, password);

			// step-3 create statement
			Statement statement = connection.createStatement();

			// step-4 create query
			String update = "update teacherdetails130 set teacherSubject='CSE' where teacherId=" + id + "";
			int id2 = statement.executeUpdate(update);
			if (id2 != 0) {
				String delete = "delete  from teacherdetails130 where teacherId=" + id + "";
				statement.executeUpdate(delete);
				System.out.println("data...............deleted");
			}

			else {
				System.out.println("Id is not present in database");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			// step-5 close the connection

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// updateTeacherName by Id
	public void updateTeacherName(String name, int id) {
		Connection connection = null;
		try {

			// step-1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/student130";
			String username = "root";
			String password = "Vishesh@123";
			connection = DriverManager.getConnection(url, username, password);

			// step-3 create statement
			Statement statement = connection.createStatement();

			// step-4 create query
			String update = "update teacherdetails130 set teacherSubject='CSE' where teacherId=" + id + "";
			int id2 = statement.executeUpdate(update);
			if (id2 != 0) {
				{
					String update1 = "update  teacherdetails130 set teacherName='" + name + "' where teacherId=" + id
							+ "";
					statement.executeUpdate(update1);
					System.out.println("name...............updated");
				}

			}

			else {
				System.out.println("Id is not present in database");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			// step-5 close the connection

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

// update teacherEmail by Id
	public void updateTeacherEmail(String Email, int id) {
		Connection connection = null;
		try {
			// step-1 load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/student130";
			String username = "root";
			String password = "Vishesh@123";
			connection = DriverManager.getConnection(url, username, password);

			// step-3 create statement
			Statement statement = connection.createStatement();

			// step-4 execute query
			String update = "update teacherdetails130 set teacherSubject='CSE' where teacherId=" + id + "";
			int id1 = statement.executeUpdate(update);
			if (id1 != 0) {
				String update1 = "update teacherdetails130 set teacherEmail='" + Email + "' where teacherId=" + id + "";
				statement.executeUpdate(update);
				System.out.println("email.................updated");
			} else {
				System.out.println("Id is not present in database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// step-5 close the connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// displayData method
	public List<Teacher> displayTeacher() {
		Connection connection = null;
		try {

			// step-1 load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/student130";
			String username = "root";
			String password = "Vishesh@123";
			connection = DriverManager.getConnection(url, username, password);

			// step-3 create statement
			Statement statement = connection.createStatement();

			// step-4 execute query
			String select = "select * from teacherdetails130";
			ResultSet resultSet = statement.executeQuery(select);
			List<Teacher> teacher = new ArrayList<Teacher>();
			while (resultSet.next()) {
				int id = resultSet.getInt("teacherId");
				String name = resultSet.getString("teacherName");
				String email = resultSet.getString("teacherEmail");
				String subject = resultSet.getString("teacherSubject");
				Teacher teacher1 = new Teacher();
				teacher1.setTeacherId(id);
				teacher1.setTeacherEmail(email);
				teacher1.setTeacherName(name);
				teacher1.setTeacherSubject(subject);
				teacher.add(teacher1);
			}
			return teacher;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// step-5 close connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}