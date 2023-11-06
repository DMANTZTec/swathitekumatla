package functionInterface;

import java.util.*;
import java.util.function.Function;
public class Customer {

	public static void main(String[] args) 
	{
	List<Bank> cs = new ArrayList<>();
	cs.add(new Bank(1, "swathi", 2000));
	cs.add(new Bank(2, "anupama",1500));
	cs.add(new Bank(3, "subha", 3000));
	cs.add(new Bank(4, "anusha", 2300));
	
	Function<Bank, Integer> fn=c->{
		int bal=c.balance;
		
		if(bal>=1000 && bal<=2000)
		 return 200;
		else if(bal>=2000 && bal<=3000)
		 return 300;
		else
		return 0;
	};
	
	for(Bank b: cs)
	{
		int addingAmount=fn.apply(b);
		
		System.out.println(b.accNo+"   "+b.name);
		System.out.println(" adding amount is:"+addingAmount);
	}
}

}

