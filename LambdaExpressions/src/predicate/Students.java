package predicate;

import java.util.*;
import java.util.function.*;

public class Students {

	public static void main(String[] args) {
		List<StudentDetails> st = new ArrayList<>();
		st.add(new StudentDetails(1, "swathi", 16, 970));
		st.add(new StudentDetails(2, "anupama", 15, 900));
		st.add(new StudentDetails(3, "subha", 16, 970));
		st.add(new StudentDetails(4, "anusha", 15, 976));
     
		Predicate<StudentDetails> pr = s -> (s.age > 15 && s.marks > 950);
		for (StudentDetails s : st) {
			if (pr.test(s)) {
				System.out.println(s.rollNo + "   " + s.name);
			}
		}
	}

}
