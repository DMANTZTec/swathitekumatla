package polymorphism;

public class Students {

	public static void main(String[] args) 
	{
		StudentDetails student=new StudentDetails();
		student.studentData(1,"swathi");
		student.studentData(1, "swathi", 200);
		StudentDetails2 student2=new StudentDetails2();
		student2.studentData(1," swathi", 200,8);
	}
}
