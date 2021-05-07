import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileBufferedReader {
	public static void main(String[] args) throws Exception {
		try {
			FileReader f = new FileReader("D:\\Example.txt");
			BufferedReader b = new BufferedReader(f);
			String i = b.readLine();
			while(i!=null) {
				System.out.println(i);
				i = b.readLine();
			}
			b.close();
		}
		catch(Exception e) {
			System.out.println("Exception occurred:" + e);
		}
	}
}
