package multilevelInheritance;

public class Programmer extends Employee
{
 public int empSalary;
 public int empBonus;
 public void programmerDetails(int empSalary, int empBonus)
 {
	 this.empSalary=empSalary;
	 this.empBonus=empBonus;
	 System.out.println("EmployeeSalary="+empSalary+"\n"+"EmployeeBonus="+empBonus);
 }
}
