package com.Innerclasses.MemberInnerclass;

public class EmployeeDetails {

	public static void main(String[] args) 
	{
		Employee obj=new Employee();
        Employee.Inner obj1=obj.new Inner();
        obj1.display();
	}

}
