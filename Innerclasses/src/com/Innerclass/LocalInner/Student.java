package com.Innerclass.LocalInner;

public class Student 
{
private int roll=2;
void display()
{
	String name="swathi";
	class Local
	{
		 void print()
		 {
			System.out.println(name);
			}
	}
	Local obj=new Local();
	obj.print();
}
}
