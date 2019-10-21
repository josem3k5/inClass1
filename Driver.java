import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		Object[] ar = new Object[10];
		
		try {
			
			Student s1 = new Student("Alex", "", 3);
			Student s2 = new Student("We", "Wa", 4);
			Student s3 = new Student("X", "Y", 5);
			
			ar[0] = 2;
			ar[1] = s1;
			ar[2] = "aha";
			ar[3] = s2;
			ar[4] = s3;
			
			// reference type of NameHolder or student?
			NameHolder bo = new Student("O", "p", 1);
			
			//Student has getRating method but not NameHolder, thus you cast
			//bo.getRating(); <-- wrong
			((Student)bo).getRating();
			
			for(Object o: ar) {
				
				System.out.println(o);
			}
			
			// for future use---> List<Student> sx = new ArrayList<>();
			// can replace ArrayList with LinkedList and code will still function properly
			LinkedList<Student> students = new LinkedList<>();
			students.add(s1);
			students.add(s2);
			students.add(s3);
			// Have to cast
			students.add((Student) bo);
			students.add(s1);
			students.add(s2);
			students.add(s3);
			// Have to cast
			students.add((Student) bo);
			students.add(s1);
			students.add(s2);
			students.add(s3);
			// Have to cast
			students.add((Student) bo);
			Map <String, Student> m = new HashMap <String, Student>();
			Integer index = 0;
			for(Student s: students) {
				m.put("s1" + index++, s);
				System.out.println(s);
			}
			
		} catch (NameException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
