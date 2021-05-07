import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileToAnother {
	public static void main(String[] args) {
		try {
			FileInputStream i = new FileInputStream("D:\\Example.txt");
			FileOutputStream o = new FileOutputStream("D:\\Example1.txt");
			byte[] b = new byte[50];
			i.read(b);
			o.write(b);
			i.close();
			o.close();
		}
		catch(Exception e) {
			System.out.println("Exception Occurred:" + e);
		}
	}
}
