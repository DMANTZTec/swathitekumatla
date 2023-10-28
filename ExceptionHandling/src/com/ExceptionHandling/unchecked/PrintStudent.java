package com.ExceptionHandling.unchecked;

public class PrintStudent
{
 public static void printName(String myString)
 {
	 try
	 {
	 System.out.println(myString.length());
	 }
	 catch(NullPointerException e)
	 {
		 System.out.println("name is null");
	 }
 }
}
