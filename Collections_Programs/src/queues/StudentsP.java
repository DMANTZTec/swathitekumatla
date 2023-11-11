package queues;

import java.util.*;
public class StudentsP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsData s1=new StudentsData();
		s1.setRollNo(1);
		s1.setName("Gowtham");
		s1.setRank(10);
		s1.setCollege("CBIT");
		
		StudentsData s2=new StudentsData();
		s2.setRollNo(2);
		s2.setName("sai");
		s2.setRank(7);
		s2.setCollege("Vasavi");
		
		StudentsData s3=new StudentsData();
		s3.setRollNo(3);
		s3.setName("shiva");
		s3.setRank(5);
		s3.setCollege("MGIT");
		
		StudentsData s4=new StudentsData();
		s4.setRollNo(4);
		s4.setName("teja");
		s4.setRank(15);
		s4.setCollege("CVR");
		
		PriorityQueue < StudentsData> data=new PriorityQueue <StudentsData>();
		data.add(s1);
		data.offer(s2);
		data.add(s3);
		data.add(s4);
		System.out.println("head element="+data.element());
		System.out.println("head="+data.peek());
		System.out.println();
		
		Iterator itr=data.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		System.out.println(data.remove(s2));
		System.out.println(data.poll());
		System.out.println("head element="+data.element());
		System.out.println("After removing elements:"+data);
		
	}

}
