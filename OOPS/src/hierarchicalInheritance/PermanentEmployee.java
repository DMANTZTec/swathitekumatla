package hierarchicalInheritance;

public class PermanentEmployee extends Employee
{
  public float bonus=2000;
  public int increment=10000;
  public float totalSalary;
  public void permanentEmployeeDetails()
  {
	  totalSalary=salary+bonus+increment;
	  System.out.println("permanent employee data:"+"name="+name+","+"employeeid="+empId+","+"Salary="+salary+","+"bonus="+bonus+","+"increment="+increment+","+"totalSalary="+totalSalary);
  }
  
}
