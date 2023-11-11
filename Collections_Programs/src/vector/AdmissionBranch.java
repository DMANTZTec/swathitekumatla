package vector;

import java. util.*;

public class AdmissionBranch {
public static void main(String args[])
{
	Students s1=new Students();
	s1.setRollNo(1);
	s1.setName("swathi");
	s1.setDepartment("cse");
	
	Students s2=new Students();
	s2.setRollNo(2);
	s2.setName("anupama");
	s2.setDepartment("eee");
	
	Students s3=new Students();
	s3.setRollNo(3);
	s3.setName("Shubashini");
	s3.setDepartment("it");
	
	List<Students> data=new Vector<Students>();
	data.add(s1);
	data.add(s2);
	data.add(s3);
	 System.out.println(data);
	 
	 System.out.println("size="+data.size());
	 System.out.println("capacity="+((Vector<Students>) data).capacity());
	 
	 if(data.contains(s2))
	 {
		 System.out.println(data.indexOf(s2));
	 }
	 else
	 {
		 System.out.println("not present");
	 }
	
	 System.out.println(((Vector<Students>) data).firstElement());
	 System.out.println(((Vector<Students>) data).lastElement());
	 
	 Students s4=new Students();
		s4.setRollNo(4);
		s4.setName("Soumya");
		s4.setDepartment("civil");
		
		data.set(1, s4);
		System.out.println(data);
		
		data.remove(1);
		System.out.println(data);
		
		System.out.println("hashcode="+data.hashCode());
		System.out.println("element at index 2="+"data.get(2)");
		
		System.out.println(data);
		data.clear();
		
		System.out.println(data);
		
	 
}
}
