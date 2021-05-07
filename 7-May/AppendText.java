import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class AppendText {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			File f = new File("D:\\Example.txt");
			FileWriter fi = new FileWriter(f, true);
			BufferedWriter b = new BufferedWriter(fi);
			PrintWriter p = new PrintWriter(b);
			System.out.println("Enter for FileWriter:");
			String s = sc.nextLine();
			System.out.println("Enter for BufferedWriter:");
			String s1 = sc.nextLine();
			System.out.println("Enter for PrintWriter:");
			String s2 = sc.nextLine();
			p.println("\n" + s);
			p.println(s1);
			p.println(s2);
			p.close();
			sc.close();
		}
		catch(Exception e) {
			System.out.println("Exception occurred:" + e);
		}
	}
}
