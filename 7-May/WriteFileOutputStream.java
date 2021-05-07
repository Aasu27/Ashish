import java.io.FileOutputStream;
import java.util.*;
public class WriteFileOutputStream {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			FileOutputStream f = new FileOutputStream("D:\\Example.txt");
			System.out.println("Enter the String:");
			String s = sc.nextLine();
			byte[] b = s.getBytes();
			f.write(b);
			sc.close();
			f.close();
		}
		catch(Exception e) {
			System.out.println("Exception occurred:" + e);
		}
	}
}
