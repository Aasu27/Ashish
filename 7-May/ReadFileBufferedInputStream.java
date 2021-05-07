import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ReadFileBufferedInputStream {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("D:\\Example.txt");
			BufferedInputStream b = new BufferedInputStream(f);
			int i = b.read();
			while(i!=-1) {
				System.out.print((char)i);
				i = b.read();
			}
			b.close();
		}
		catch(Exception e) {
			System.out.println("Exception occurred:" + e);
		}
	}
}
