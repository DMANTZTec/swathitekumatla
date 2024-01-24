package com.SuperKeyword.Student;

public class Student2 extends Student1
{
	String name="karuna";
	  public void display()
	  {
		  System.out.println("name1="+name);
		  System.out.println("name2="+super.name);
		  
	  }
	 public void show()
	 {
		 super.display();
		 display();
	 }
	  
}
