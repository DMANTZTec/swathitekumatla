package com.sql.jdbc;
import java.sql.*;

public class Employee_Data {
	public void addEmployee(Employee emp) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employesdata", "root", "Swathi@27"); // table details
		
		String insert = "insert into users values(?,?,?)";

		PreparedStatement ps = con.prepareStatement(insert);
		ps.setInt(1, emp.getEmpId());
		ps.setString(2, emp.getEmpName());
		ps.setDouble(3, emp.getEmpSalary());
		ps.execute();
		
	}
	
	public void deleteEmployee(Employee emp) throws SQLException {

		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employesdata", "root", "Swathi@27"); // table details
		String delete = "Delete from users where empId=?";
		PreparedStatement ps = con.prepareStatement(delete);
		ps.setInt(1, emp.getEmpId());
		ps.execute();
		
	}
	public void updateEmployee(Employee emp) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employesdata", "root", "Swathi@27"); // table details
		String update="update users set empName=?,empSalary=? where empId=?";
		PreparedStatement ps = con.prepareStatement(update);
		ps.setString(1, emp.getEmpName());
		ps.setDouble(2, emp.getEmpSalary());
		ps.setInt(3, emp.getEmpId());
		ps.execute();
		
	}
	public void getInformation(Employee emp) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employesdata", "root", "Swathi@27"); // table
		Statement statement = con.createStatement();
		
		String table = "Select empId , empName , empSalary from users"; 
		statement.execute(table);
		ResultSet rs =statement.executeQuery(table);
		while (rs.next()) {
			int id= rs.getInt("empId");
			String name = rs.getString("empName");
			double salary = rs.getDouble("empSalary");
			System.out.println(id + "\t" + name + " \t" + salary);
			
		}																									// detail

	}
	
}

