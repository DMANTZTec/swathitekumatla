package encapsulation;

public class VendingMachineGenerator 
{
	public static void main(String[] args) 
	{
		VendingMachine juice=new VendingMachine();
		juice.setCountOfPepsi(1);
		juice.setCountOfCocola(2);
		juice.setCountOfMazza(1);
		juice.setCountOfWaterBottles(1);
		System.out.println("Congratulations you have got  "+juice.getCocola()+" cocola bottles");
		System.out.println("Congratulations you have got  "+juice.getMazza()+" Mazza bottles");

	}

}
