package com.AccessModifiers.Scope;

public class Employee2 {

	public static void main(String[] args) 
	{
		Employee obj=new Employee();
		obj.getDetails();  //compile time error because of private method

	}

}
