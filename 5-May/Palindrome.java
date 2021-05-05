import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		String r="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.next();
		sc.close();
		int l = s.length();
		for(int i=l-1;i>=0;i--) {
			r = r + s.charAt(i);
		}
		if(s.equals(r)) {
			System.out.println(s + " is a Palindrome String.");
		}
		else {
			System.out.println(s + " is not a Palindrome String.");
		}
	}
}
