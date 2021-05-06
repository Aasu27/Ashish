import java.util.*;
public class IntegerToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int i = sc.nextInt();
		String s = Integer.toString(i);
		System.out.println("String : " + s);
		sc.close();
	}
}
