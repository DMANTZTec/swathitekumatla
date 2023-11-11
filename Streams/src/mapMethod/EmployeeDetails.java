package mapMethod;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDetails {

	public static void main(String[] args) 
	{
		List<Employee> details=Arrays.asList(
				new Employee(1,"swathi","tekumatla","DEV","SE",24000.00,23),
				new Employee(2,"anupama","chileveri","ADMIN","DBA",22000.00,24),
				new Employee(3,"subha","kolluri","DEV","VP",23000.00,20),
				new Employee(4,"harshu","thottempudi","ADMIN","SE",20000.00,23)
				);
		
			List<Employee> details1=Arrays.asList(
				new Employee(10,"karuna","tekum","DEV","DBA",27000.00,23),
				new Employee(20,"anu","chikku","ADMIN","SE",30000.00,24),
				new Employee(30,"subhasri","","DEV","SE",28000.00,20),
				new Employee(40,"harshu","thottem","ADMIN","DBA",25000.00,23)
				);
		
		Stream <Employee> s1=details.stream();
		List<List<Employee>> data=Arrays.asList(details, details1);
		//Firstnames in sorted order
		details.stream()
		.map(e->e.getFirstName())
		.forEach(e->System.out.println(e));
		
		//sum of salaries of all employees in "dev" department
		 System.out.println(details.stream()
				 .filter(e->e.getDepartment().contentEquals("DEV"))
				 .mapToDouble(e->e.getSalary()).sum());	
	
		   //get the salary by name
		Map<String, Double> empsMap= details.stream().collect(Collectors.toMap(e->e.getFirstName(),e->e.getSalary()));
		System.out.println(empsMap);
		
		//max salary of the employees
		System.out.println(details.stream()
				.mapToDouble(e-> e.getSalary()).max());
		
		//min salary of the employess
		System.out.println(details.stream()
				.mapToDouble(e->e.getSalary()).min());
		
		//flatmap used for  executed  in streams
		data.stream()
		.flatMap(emp->emp.stream())
		.forEach(emp->System.out.println(emp));
		System.out.println();
		
		//distinct data
		data.stream()
		.distinct().forEach(e->System.out.println(e));
		System.out.println();
		
		//parallel stream
		details.stream().parallel()      //parallelstream()
		.filter(e->e.getSalary()>20000)
		.forEach(emp->System.out.println(emp.getId()+" "+emp.getSalary()));
		 }
}
