package filterMethod;

import java.util.*;

public class ProductDetails {

	public static void main(String[] args) 
	{
		List<Product> data=Arrays.asList(
				new Product(12, "Dell Laptop-i3 processor",60000.00,5,4.5),
				new Product(67, "Dell Laptop-i5",55000.00,4,5.0),
				new Product(37, "Hp laptop",50000.00,5,4.0),
				new Product(45, "Asus laptop",45000.00,4,5.0),
				new Product(76, "Thinkpad laptop",35000.00,3,4.5)
				);
	//print list of products
		data.stream().forEach(p->System.out.println(p));
		System.out.println();
		
		//price <50000 and rating above 4.0
		data.stream().filter(p->p.getPrice()<50000.00 && p.getRating()>4.0).forEach(p->System.out.println(p));
		System.out.println();
		
		//sort by names
		data.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(System.out::println);
		System.out.println();
		
		//count of laptops
		System.out.println(data.stream().filter(p->p.getName().equals("Hp laptop")).count());
	}

}
