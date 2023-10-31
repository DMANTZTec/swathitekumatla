package abstraction;

public class MainBank 
{

	public static void main(String[] args)
	{
		Bank b;
		b=new CanaraBank();
		System.out.println("Customer accNo="+b.getAccountInfo()+","+"rate of interest="+b.getRateOfInterest());
		b=new SBI();
		System.out.println("Customer accNo="+b.getAccountInfo()+","+"rate of interest="+b.getRateOfInterest());
		b=new HDFC();
		System.out.println("Customer accNo="+b.getAccountInfo()+","+"rate of interest="+b.getRateOfInterest());
		

	}

}
