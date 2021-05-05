import java.util.*;
public class Factor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int i  = sc.nextInt();
		sc.close();
		System.out.println("Factor of " + i + ":");
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				System.out.println(j);
			}
		}
	}
}
