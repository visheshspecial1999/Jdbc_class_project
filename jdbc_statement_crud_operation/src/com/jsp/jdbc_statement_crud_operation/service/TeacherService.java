package com.jsp.jdbc_statement_crud_operation.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc_statement_crud_operation.dao.TeacherDao;
import com.jsp.jdbc_statement_crud_operation.dto.Teacher;

public class TeacherService {

	
	/*
	 * insert method of TeacherCondition for validation of data policy 
	 * and inside that method we are connecting the TeacherDao layer to
	 *  complete the data insertion process.
	 */
	TeacherDao teacherDao=new TeacherDao();
	public void Teachercondition(Teacher teacher)
	{
		if(teacher.getTeacherSubject().equalsIgnoreCase("CSE"))
		{
			teacherDao.insertTeacher(teacher);
		}
		else
		{
			System.out.println("hey please check what pass...");
		}
	}
	
	
	/*
	 * getbyId method for teacher
	 */
	public void getById(int id)
	{
		teacherDao.getById(id);
	}
	
	
	/*
	 delete teacher method for condition validation
	 */
	public void deleteById(int id)
	{
		teacherDao.deleteById(id);
	}
	
	
	/*
	 * updateTeacher method by Id
	 */
	public void updateTeacher(int id)
	{	System.out.println("1.Name\n2.Email"); 
	Scanner s=new Scanner(System.in);
	int choice=s.nextInt();
		switch(choice) {
		case 1:{
			System.out.print("enter teacher name: ");
			String name=s.next();
			// updation of teacher name using teacher id
		teacherDao.updateTeacherName(name, id);
		}break;
		
		case 2:{
			System.out.print("enter teacher email: ");
			String email=s.next();
			// updation of teacher email using teacher id
			teacherDao.updateTeacherEmail(email, id);	
		}break;
	}
		
	}
	
	// displayData method
	public List<Teacher> displayTeacher()
	{
		return teacherDao.displayTeacher();
	}
}
