import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		int a,b,c;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		System.out.println("Enter an operator(+,-,*,/):");
		ch = sc.next().charAt(0);
		switch (ch) {
		case '+':
			c = a+b;
			System.out.println("Addition is : " + c);
			break;
			
		case '-':
			c = a-b;
			System.out.println("Substraction is : " + c);
			break;
			
		case '*':
			c = a*b;
			System.out.println("Multiplication is : " + c);
			break;
			
		case '/':
			c = a/b;
			System.out.println("Division is : " + c);
			break;
			
		default:
			System.out.println("Please enter valid choice : ");
			break;
		}
		sc.close();
	}
}
