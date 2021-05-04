import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToInteger {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Decimal number:");
		String str = bf.readLine();
		int value = Integer.parseInt(str);
		int i = Integer.valueOf(value).intValue();
		System.out.println("Integer number is:" + i);
	}
}
