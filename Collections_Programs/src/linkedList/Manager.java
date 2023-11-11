package linkedList;

import java. util.*;

public class Manager {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("swathi");
		e1.setId(1);
		e1.setSalary(10000);

		Employee e2 = new Employee();
		e2.setName("mamatha");
		e2.setId(2);
		e2.setSalary(200000);

		Employee e3 = new Employee();
		e3.setName("maggi");
		e3.setId(3);
		e3.setSalary(30000);

		Employee e4 = new Employee();
		e4.setName("yippe");
		e4.setId(4);
		e4.setSalary(40000);

		LinkedList<Employee> list = new LinkedList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		for (Employee st: list) {
			System.out.println(st.getName() + " " + st.getId() + " " + st.getSalary());
		}
		System.out.println();
		Employee e5 = new Employee();
		e5.setName("noodles");
		e5.setId(5);
		e5.setSalary(5000);

		list.addFirst(e5);
		Employee e6 = new Employee();
		e6.setName("karuna");
		e6.setId(7);
		e6.setSalary(7000);
		list.addLast(e6);

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();
		System.out.println(list.size());

		list.removeFirst();
		list.removeLast();

		System.out.println(list);
		System.out.println();

		list.set(0, e3);
		Iterator<Employee> itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		list.clear();
		System.out.println(list);
	}

}
