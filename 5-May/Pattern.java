import java.util.*;
public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int i,j;
		for(i=0; i<n; i++) {
			for(j=n-i; j>1; j--) {
				System.out.print(" ");	
			}
			for(k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
