import java.util.*;
public class DecimalToInteger {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		String str = sc.nextLine();
		int val = Integer.parseInt(str);
		int i = Integer.valueOf(val).intValue();
		System.out.println("Integer number is:" + i);
	}
}
