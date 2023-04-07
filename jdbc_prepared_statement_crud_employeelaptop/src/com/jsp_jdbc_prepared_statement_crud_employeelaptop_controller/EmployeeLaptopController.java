 package com.jsp_jdbc_prepared_statement_crud_employeelaptop_controller;

import java.util.Scanner;

import com.jsp_jdbc_prepared_statement_crud_employeelaptop.Employee;
import com.jsp_jdbc_prepared_statement_crud_employeelaptop.Laptop;
import com.jsp_jdbc_prepared_statement_crud_employeelaptop_service.EmployeeLaptopService;

public class EmployeeLaptopController {

	public static void main(String[] args) {
	while (true) {	
		System.out.println();
		System.out.println("1.Insert\n2.Search\n3.Update\n4.Delete\n5.Exit");
		Scanner s = new Scanner(System.in);
		System.out.print("enter your choice: ");
		int choice = s.nextInt();
		
			switch (choice) {
			case 1: {
				
				Employee employee=new Employee();
				Laptop laptop=new Laptop();
				System.out.println("Enter laptopSerialNumber: ");
				int laptopSerialNumber=s.nextInt();
				laptop.setLaptopSerialNumber(laptopSerialNumber);
				System.out.println("Enter laptopName: ");
				String laptopName=s.next();
				laptopName+=s.nextLine();
				laptop.setLaptopName(laptopName);
				System.out.println("Enter laptopMemory: ");
				String  laptopMemory=s.nextLine();
				laptop.setLaptopMemory(laptopMemory);
				System.out.println("Enter laptopPrice: ");
				double laptopPrice=s.nextDouble();
				laptop.setLaptopPrice(laptopPrice);
				System.out.println("Enter employeeId: ");
				int employeeId=s.nextInt();
				employee.setEmployeeId(employeeId);
				System.out.println("Enter employeeName: ");
				String employeeName=s.next();
				employeeName+=s.nextLine();
				employee.setEmployeeName(employeeName);
				System.out.println("Enter employeeEmail: ");
				String eplloyeeEmail=s.next();
				employee.setEmployeeEmail(eplloyeeEmail);	
				
				employee.setLaptop(laptop);
				/*
				 *  calling the service method for connection the insertEmployeeLaptop(Employee employee) method 
				 *  with controller class
				 */
				EmployeeLaptopService service=new EmployeeLaptopService();
				service.insertEmployeeLaptop(employee);
			} 
				break;
			case 2: {

			}
				break;
			case 3: {

			}
				break;
			case 4: {

			}
				break;
			case 5: {
				System.out.println("system..............closed");
				System.exit(choice);
			}
				break;
			}
		}
	}

}
