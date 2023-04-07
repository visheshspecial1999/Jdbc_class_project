package com.jsp.jdbc_statement_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc_statement_crud_operation.dao.TeacherDao;
import com.jsp.jdbc_statement_crud_operation.dto.Teacher;
import com.jsp.jdbc_statement_crud_operation.service.TeacherService;

public class TeacherController {

	public static void main(String[] args) {
		
		/*
		 * but we want to check some condition while inserting the data. Hence we
		 * connecting TeacherController to TeacherServeice instead of direct connection
		 * btw TeacherController to TeacherDao.
		 */
		// service.Teachercondition(teacher);

		Scanner sc = new Scanner(System.in);
		TeacherService service = new TeacherService();

		while (true) {
			System.out.println("============================================================================================");
			System.out.println("1.Insert\n2.GetById\n3.Delete\n4.Update\n5.Display\n6.Exit");
			System.out.print("enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("enter the teacher details as asked by the program");
				System.out.println("enter teacherId: ");
				int teacherId = sc.nextInt();
				System.out.println("enter teacherName: ");
				String teacherName = sc.next();
				System.out.println("enter teacherEmail: ");
				String teacherEmail = sc.next();
				System.out.println("enter teacherSubject: ");
				String teacherSubject = sc.next();
				/*
				 * In order to call the setter method of Teacher class (Dto layer) we are
				 * creating the object of Teacher class in TeacherController
				 */

				Teacher teacher = new Teacher();
				teacher.setTeacherId(teacherId);
				teacher.setTeacherName(teacherName);
				teacher.setTeacherEmail(teacherEmail);
				teacher.setTeacherSubject(teacherSubject);
//				/*
//				 * since the data inserting query is present inside of insertTeacher(Teacher
//				 * teacher) method and that method is present inside of TeacherDao class. Hence
//				 * we need to create the object of TeacherDao class so that we can get the
//				 * access of insertTeacher(Teacher teacher) method.
//				 */
//				TeacherDao teacherDao = new TeacherDao();
//				teacherDao.insertTeacher(teacher);
				service.Teachercondition(teacher);
			}break;
			
			case 2: {
				System.out.println("enter the teacher Id to featch the details");
				int id = sc.nextInt();
				service.getById(id);
			}break;

			case 3: {
				System.out.println("enter the teacher Id to delete the data");
				int id = sc.nextInt();
				service.deleteById(id);

			}break;
				
			case 4:{System.out.println("enter the teacher Id to update the data");
			int id = sc.nextInt();
			service.updateTeacher(id);		
			}break;
			
			case 5:{
				List<Teacher> list=service.displayTeacher();
				for(Teacher teacher :list)
				{
					System.out.println("teacherId= "+teacher.getTeacherId());
					System.out.println("teacherName= "+teacher.getTeacherName());
					System.out.println("teacherEmail= "+teacher.getTeacherEmail());
					System.out.println("teacherSubject= "+teacher.getTeacherSubject());
					System.out.println("...............................................");
				}	
			}break;
			
			case 6:{
			System.out.println("process.................ended");
			System.exit(choice);
				
			}break;
			
			default :{
				System.out.println(" ! Invalid choice please try again...\n");
			}
			}	
		}
	}
}
