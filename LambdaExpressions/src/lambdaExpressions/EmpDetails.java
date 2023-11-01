package lambdaExpressions;

public class EmpDetails implements Employee
{
@Override
public void employeeDetails(int empId, String name, int salary, int experience) 
{
	System.out.println("emplyee Id="+empId+","+"emplyee name="+name+","+"salary="+salary+","+"experience="+experience);		
}
}
