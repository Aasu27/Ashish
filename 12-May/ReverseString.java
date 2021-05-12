import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		Stack s1 = new Stack();
		for(Character c:s.toCharArray()) {
			s1.push(c);
		}
		String r="";
		while(!s1.isEmpty()) {
			r = r + s1.pop();
		}
		System.out.println("Reverse : " + r);
		sc.close();
	}
}
