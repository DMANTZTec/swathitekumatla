package com.sql.jdbc;

import java.sql.*;

public class Test {
	
	public static void main(String[]args) throws SQLException, ClassNotFoundException {
		
		
		Employee employee=new Employee();
		employee.setEmpId(1);
		employee.setEmpName("swathi");
		employee.setEmpSalary(20000.0);
		
		Employee employee1=new Employee();
		employee1.setEmpId(2);
		employee1.setEmpName("anupama");
		employee1.setEmpSalary(25000.0);
		
//		Employee employee2=new Employee();
//		employee2.setEmpId(3);
//		employee2.setEmpName("subha");
//		employee2.setEmpSalary(30000.0);
		
		
		Employee_Data empl=new Employee_Data();
		  empl.addEmployee(employee);
			empl.getInformation(employee);
        // empl.deleteEmployee(employee);
           empl.addEmployee(employee1);
		  //empl.updateEmployee(employee1);
		  empl.getInformation(employee1);
		
	}

}