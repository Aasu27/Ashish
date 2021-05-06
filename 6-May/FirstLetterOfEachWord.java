import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class FirstLetterOfEachWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		sc.close();
		
		Pattern p = Pattern.compile("\\b[a-zA-Z]");
		Matcher m = p.matcher(s);
		System.out.print("First Letter : ");
		while(m.find()) {
			System.out.print(m.group());
		}
	}
}
