package lambdaExpressions;

public class EmployeesData
{

	public static void main(String[] args) 
	{
		
       Employee emp=(empId, name, salary, experience)-> System.out.println("Employee details:"+empId+","+name+","+salary+","+experience);
       emp.employeeDetails(1,"swathi", 20000, 2); // it is printed by using lambda expresssions
       Employee emp1=new EmpDetails();  // object created to override class
       emp1.employeeDetails(2, "anupama", 15000, 1); // it is printed by object 
       
	}
}
