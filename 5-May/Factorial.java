import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		sc.close();
		int f=1;
		for(int i=1;i<=n;i++) {
			f = f*i;
		}
		System.out.println("Factorial is:" + f);
	}
}