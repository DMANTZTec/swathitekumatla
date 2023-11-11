package worldStates;

import java.util.*;

public class World_States {

	public static void main(String[] args) {
		States s1 = new States();
		s1.setName("India");
		s1.setCity1("Telanagna");
		s1.setCity2("Andhra Prdesh");
		s1.setNo_districts(30);

		States s2 = new States();
		s2.setName("USA");
		s2.setCity1("Michigan");
		s2.setCity2("New Jersey");
		s2.setNo_districts(25);

		States s3 = new States();
		s3.setName("Canada");
		s3.setCity1("Ontario");
		s3.setCity2("Alberta");
		s3.setNo_districts(15);

		ArrayList<States> cityNames = new ArrayList<States>();
		// adding customer class objects
		cityNames.add(s1);
		cityNames.add(s2);
		cityNames.add(s3);
		Iterator iterator = cityNames.iterator();
		System.out.println("CityNames elements by using iterator: ");
		while (iterator.hasNext())
			System.out.println(iterator.next() + " ");
		System.out.println("\n");
		iterator.remove();

		System.out.println("After removing city:" + cityNames + "\n");

		System.out.println("printing Cities by using listiterator:");

		ListIterator<States> iterator1 = cityNames.listIterator();
		while (iterator1.hasNext()) 
		{
			States i = iterator1.next();
			System.out.println(i);
		}
		System.out.println("\n");
		
		iterator1.add(s3);
		
		System.out.println("cities printing in reverse order by using listiterator:");
		while (iterator1.hasPrevious()) 
		{
			States i = iterator1.previous();
			System.out.println(i);
		}

	}
}
