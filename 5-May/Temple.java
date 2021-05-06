import java.util.*;
public class Temple {
	public static void main(String[] args) {
		float total=0,initial,amount=2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of temple:");
		int n = sc.nextInt();
		System.out.println("Donation:");
		int d = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++) {
			total = (2*total) + d;
			amount = amount*2;
		}
		initial = total/(amount/2);
		System.out.println("Initial Amount : " + initial);
	}
}
