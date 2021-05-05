import java.util.*;
public class SwapBitwise {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		i = sc.nextInt();
		j = sc.nextInt();
		sc.close();
		
		i = i^j;
		j = i^j;
		i = i^j;
		System.out.println("After Swap: " + i + "\n" + j);
	}
}
