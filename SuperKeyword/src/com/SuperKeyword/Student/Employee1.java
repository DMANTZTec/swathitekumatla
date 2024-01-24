package com.SuperKeyword.Student;

public class Employee1  extends Person
{
float salary;
Employee1(int id,String name,float salary)
{
	super(id,name);
	this.salary=salary;
}
public void display()
{
	System.out.println("id="+id+" "+"name="+name+" "+"salary="+salary);
}
}
