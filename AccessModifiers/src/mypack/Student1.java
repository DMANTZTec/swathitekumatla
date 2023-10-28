package mypack;
import pack.*;
public class Student1 {

	public static void main(String[] args) 
	{
	Student obj=new Student(); // compile time error
	obj.printDetails(); //compile time error scope of Student and its method is default so it cannot accessed from outside the package

	}

}
