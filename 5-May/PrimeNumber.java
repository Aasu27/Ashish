import java.util.*;

public class PrimeNumber{
	public static void main(String[] args){
		int a,b=0,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int i = sc.nextInt();
		sc.close();
		b = i/2;
		if(i==0 || i==1) {
			System.out.println(i + " is not a prime number");
		}
		else {
			for(a=2;a<=b;a++) {
				if(i%a==0) {
					System.out.println(i + " is not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(i + " is a prime number");
			}
		}
	}
}
