import java.util.*;
public class SunnyNumber {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		sc.close();
		a = n+1;
		if(Math.sqrt(a)%1 == 0) {
			System.out.println(n + " is a Sunny Number.");
		}
		else {
			System.out.println(n + " is not a Sunny Number.");
		}
	}
}
