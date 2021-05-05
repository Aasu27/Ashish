import java.util.*;
public class SumWithLoop {
	public static void main(String[] args) {
		int j,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		sc.close();
		
		for(j=1; j<=n; j++) {
			sum = sum + j;
		}
		System.out.println("Sum : " + sum);
	}
}
