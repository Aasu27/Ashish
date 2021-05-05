import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int i = sc.nextInt();
		sc.close();
		while(i!=0)
		{
			int rem = i%10;
			rev = rev*10 + rem;
			i = i/10;
		}
		System.out.println("Reverse Number:" + rev);
	}
}
