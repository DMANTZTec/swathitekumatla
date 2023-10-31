package MethodOverriding;

public class BankDetails {

	public static void main(String[] args) 
	{
	 Canara c=new Canara();
	 SBI s=new SBI();
	 AXIS a=new AXIS();
	 
System.out.println("Canara rate of Interest:"+c.getRateOfInterest());
System.out.println("SBI rate of Interest:"+s.getRateOfInterest());
System.out.println("AXIS rate of Interest:"+a.getRateOfInterest());
	}

}
