import java.util.*;
public class RoundOff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		double n = sc.nextDouble();
		sc.close();
		
		double num;
		num = Math.round(n);
		String s = Double.toString(num);
		System.out.println("String : " + s);
	}
}

