package com.Innerclass.AnonymousInner;

public class EmployeeDetails {

	public static void main(String[] args) 
	{
	Employee obj=new Employee()
			{
		void dispaly()
		{
			System.out.println("Employee details are essential");
		}
			};
			obj.dispaly();

	}

}
