package hierarchicalInheritance;

public class EmployeesData {

	public static void main(String[] args) 
	{
		TemperaryEmployee emp=new TemperaryEmployee();
       emp.employeeData("Anupama", 1, 20000);
       emp.temperaryEmployeeDetails();
       PermanentEmployee emp1=new PermanentEmployee();
       emp1.employeeData("subha", 2, 25000);
       emp1.permanentEmployeeDetails();
	}

}
