import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Birth-Date:");
		String s = sc.next();
		sc.close();
		LocalDate dob = LocalDate.parse(s);
		LocalDate now = LocalDate.now();
		int age = Period.between(dob, now).getYears();
		System.out.println("Age : " + age);
	}
}
