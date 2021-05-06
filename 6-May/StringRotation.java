import java.util.*;
public class StringRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String s1 = sc.nextLine();
		System.out.println("Enter the second String:");
		String s2 = sc.nextLine();
		sc.close();
		
		if(s1.length()!=s2.length()) {
			System.out.println("s2 is not rotated of s1");
		}
		else {
			String s3 = s1+s2;
			if(s3.contains(s2)) {
				System.out.println("s2 is rotated of s1");
			}
			else {
				System.out.println("s2 is not rotated of s1");
			}
		}
	}
}
