package multilevelInheritance;

public class Developer extends Programmer
{
public int totalSalary;
public void developerDetails()
{
	totalSalary=empSalary+empBonus;
	System.out.println("Employee total salary="+totalSalary);
}
}
