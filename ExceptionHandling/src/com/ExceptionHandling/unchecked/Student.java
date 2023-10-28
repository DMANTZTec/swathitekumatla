package com.ExceptionHandling.unchecked;

public class Student {

	public static void main(String[] args)
	{
		String name=null;     //""-->takes as 0, " "-->takes as 1
       PrintStudent.printName(name);
	}

}
