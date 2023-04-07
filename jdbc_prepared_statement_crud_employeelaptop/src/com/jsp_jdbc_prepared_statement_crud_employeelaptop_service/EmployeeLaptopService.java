package com.jsp_jdbc_prepared_statement_crud_employeelaptop_service;

import com.jsp_jdbc_prepared_statement_crud_employeelaptop.Employee;
import com.jsp_jdbc_prepared_statement_crud_employeelaptop_dao.EmployeeLaptopDao;

public class EmployeeLaptopService {
	// inserting insertEmployeeLaptop method to control the data insertion
	public void insertEmployeeLaptop(Employee employee) {
		if (employee.getLaptop().getLaptopPrice() <= 50000) {
		EmployeeLaptopDao dao=new EmployeeLaptopDao();
			dao.insertEmployeeLaptop(employee);
		} else {
			System.out.println("price is greater than your selected range.so you can not add in cart");
		}
	}
}