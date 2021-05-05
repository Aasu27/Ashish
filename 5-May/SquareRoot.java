import java.util.*;
public class SquareRoot {
	public static void main(String[] args) {
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		double n = sc.nextDouble();
		sc.close();
		b = n/2;
		do {
			a = b;
			b = (a + (n/a))/2;	
		}
		while((a-b) != 0);
		System.out.println("SquareRoot : " + b);
		
	}
}
