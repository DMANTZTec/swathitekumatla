package com.ExceptionHandling.Nestedtry;

public class StudentDetails1 
{
public static void getDetails()
{
	try
	{
	int data=500/0;
	System.out.println(data);
	}
	/*catch(ArithmeticException e)
	{
		System.out.println("dive by zero");
	}*/
	catch(NullPointerException e)
	{
		System.out.println("null pointer exception");
	}

finally
{
	System.out.println("This block exceuted compulsory");
}
}
}
