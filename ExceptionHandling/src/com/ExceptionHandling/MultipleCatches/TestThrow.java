package com.ExceptionHandling.MultipleCatches;

public class TestThrow 
{
public static void main(String args[])
{
	
	try
	{
		throw new UserDefinedException("this is user defined exception");
	}
	catch(UserDefinedException ude)
	{
		System.out.println(ude.getMessage());
	}
	
}
}
