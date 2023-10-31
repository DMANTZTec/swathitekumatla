package singleInheritance;

public class Programmer extends Employee {

	int  bonus=2000;
	public void getBonus()
	{
		System.out.println("Employee bonus:" +bonus);
	}
	public static void main(String[] args) 
	{
		Programmer obj1=new Programmer();
		obj1.getSalary();
		obj1.getBonus();

	}

}
