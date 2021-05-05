import java.util.*;
public class SumWithoutLoop {
	public static int Sum(int i) {
		if(i==0) {
			return i;
		}
		else {
			return (i * (i+1)/2);
		}
	}
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		sc.close();
		sum = Sum(n);
		System.out.println("Sum : " + sum);
	}
}
