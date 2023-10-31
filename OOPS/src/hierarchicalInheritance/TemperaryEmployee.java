package hierarchicalInheritance;

public class TemperaryEmployee extends Employee
{
	public float bonus=1000;
	  public int increment=5000;
	  public float totalSalary;
	  public void temperaryEmployeeDetails()
	  {
		  totalSalary=salary+bonus+increment;
		  System.out.println("temperary employee data:"+"name="+name+","+"employeeid="+empId+","+"Salary="+salary+","+"bonus="+bonus+","+"increment="+increment+","+"totalSalary="+totalSalary);
	  }
	  
}
