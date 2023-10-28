package com.ExceptionHandling.MultipleCatches;

public class StudentDetails 
{
  public static void printDetails()
  {
	  try
	  {
		  String name=null;
		  int[] marks= {90,78,93};
		  System.out.println(name.length());
		  System.out.println(marks[10]);
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("divede by zero");
	  }
	 // catch(NullPointerException e)
	  //{
		 // System.out.println("null string");
	 // }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println("array out of bound");
	  }
	  catch(Exception e)
	  {
		  System.out.println("parent class exception");
	  }
  }
}
