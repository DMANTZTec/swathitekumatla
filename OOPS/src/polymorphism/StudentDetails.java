package polymorphism;

public class StudentDetails 
{
  public void studentData(int rollNo, String name)
  {
	  System.out.println("RollNo="+rollNo+","+"Name="+name); 
  }
  public void studentData(int rollNo, String branch, int marks)
  {
	  System.out.println("RollNo="+rollNo+","+"branch="+branch+","+"Marks="+marks); 
  }
 
}
