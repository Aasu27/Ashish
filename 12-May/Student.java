
public class Student implements Comparable<Student>{
	String name;
	int r, age;
	Student(String name, int r, int age){
		this.name = name;
		this.r = r;
		this.age = age;
	}
	public int compareTo(Student s) {
		if(r==s.r) {
			return 0;
		}
		else if(r>s.r) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
