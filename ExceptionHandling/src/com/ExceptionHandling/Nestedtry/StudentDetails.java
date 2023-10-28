package com.ExceptionHandling.Nestedtry;

public class StudentDetails
{
	public static void getDetails()
	{
try
{
	try
	{
		String name=null;
		System.out.println(name.length());
	}
	catch(NullPointerException e)
	{
		System.out.println("null String");
	}
	try
	{
		try
	{
		int marks[]= {70,78,90};
		System.out.println(marks[7]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(" array is out of range");
	}	
  }
	catch(ArithmeticException e)
	{
		System.out.println("divide by zero");
	}

}
catch(Exception e)
{
	System.out.println("parent exception");
}
System.out.println("rest of code");
}
}
