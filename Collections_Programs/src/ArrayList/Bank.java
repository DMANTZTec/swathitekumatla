package ArrayList;

import java.util.*;

public class Bank {

	public static void main(String[] args) 
	{
		
		Customers c1 = new Customers();
		c1.setAccNo(123);
		c1.setName("swathi");
		c1.setAmount(10000);

		Customers c2 = new Customers();
		c2.setAccNo(456);
		c2.setName("mamatha");
		c2.setAmount(20000);

		Customers c3 = new Customers();
		c3.setAccNo(789);
		c3.setName("Vignesh");
		c3.setAmount(30000);

		Customers c4 = new Customers();
		c4.setAccNo(789);
		c4.setName("sowmya");
		c4.setAmount(40000);

		//System.out.println(c4.getAccNo()+"\n"+c4.getName()+"\n"+c4.getAmount());

		List<Customers> list = new ArrayList<Customers>();
	   //adding customer class objects
		list.add(c1);
		list.add(c2);
		list.add(c3);

		System.out.println(list);

		list.add(2,c4);
		System.out.println(list);
         
		Customers c5=new Customers();
		c5.setAccNo(456);
		c5.setName("harshitha");
		c5.setAmount(5000);
		
		//set method
		list.set(1, c5);
		System.out.println(list);
		System.out.println(list.get(3)); //get method
		
		//isempty method
		System.out.println(list.isEmpty());
		
		//contains method
		System.out.println(list.contains(c1));
		
		//sort method
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(765);
		list1.add(789);
		list1.add(234);

		Collections.sort(list1); 
	   System.out.println(list1);
		
	   //size method
	   System.out.println(list.size());

	   //remove method
	   System.out.println(list.remove(c1));
	   System.out.println(list);
	   //clear method
	   list.clear();
	   System.out.println(list);
	}

}
