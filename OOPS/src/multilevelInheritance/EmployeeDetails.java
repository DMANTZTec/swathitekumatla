package multilevelInheritance;

public class EmployeeDetails {

	public static void main(String[] args) 
	{
		Developer obj=new Developer();
		obj.employeeDetails();
		obj.programmerDetails(20000, 1000);
		obj.developerDetails();
	}

}
