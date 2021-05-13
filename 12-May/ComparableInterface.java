import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterface {
	public static void main(String[] args) {
		Student s1,s2;
		s1 = new Student("A", 1, 5);
		s2 = new Student("B", 2, 6);
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(s1);
		a.add(s2);
		Collections.sort(a);
		for(Student s:a) {
			System.out.println(s.name + " " + s.r + " " + s.age);
		}
	}
}
