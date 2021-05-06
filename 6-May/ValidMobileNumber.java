import java.util.*;
public class ValidMobileNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		String s = sc.next();
		sc.close();
		
		if(s.matches("\\d{10}")) {
			System.out.println(s + " is a valid Mobile Number.");
		}
		else {
			System.out.println(s + " is not a valid Mobile Number.");
		}
	}
}
