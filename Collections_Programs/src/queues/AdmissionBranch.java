package queues;

import java.util.*;

public class AdmissionBranch {
	public static void main(String args[]) {
		CollegeStudentsData c1 = new CollegeStudentsData();
		c1.setAdmissionNo(123);
		c1.setName("jessey");
		c1.setBranch("cse");

		CollegeStudentsData c2 = new CollegeStudentsData();
		c2.setAdmissionNo(345);
		c2.setName("juli");
		c2.setBranch("it");

		CollegeStudentsData c3 = new CollegeStudentsData();
		c3.setAdmissionNo(678);
		c3.setName("messi");
		c3.setBranch("ece");

		Deque<CollegeStudentsData> data = new ArrayDeque<CollegeStudentsData>();
		data.add(c1);
		data.offerFirst(c3);

		Iterator<CollegeStudentsData> itr2 = data.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println(data.peek());
		data.offerLast(c2);
		System.out.println(data);
		System.out.println("The removed element is:" + data.poll());
		System.out.println("last element=" + data.peekLast());
		
		Iterator<CollegeStudentsData> itr = data.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
