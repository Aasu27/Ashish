import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
public class WriteFileBufferedWriter {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			FileWriter f = new FileWriter("D:\\Example.txt");
			BufferedWriter b = new BufferedWriter(f);
			System.out.println("Enter the String:");
			String s = sc.nextLine();
			b.write(s);
			sc.close();
			b.close();
		}
		catch(Exception e) {
			System.out.println("Exception occurred:" + e);
		}
	}
}
