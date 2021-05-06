import java.util.*;
public class VowelsConsonants {
	public static void main(String[] args) {
		int v=0,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String l = sc.next();
		l = l.toLowerCase();
		sc.close();
		
		for(int i=0; i<l.length(); i++) {
			char ch = l.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				v++;
			}
			else if(ch>='a' && ch<='z') {
				c++;
			}
		}
		System.out.println("Vowels : " + v);
		System.out.println("Consonants : " + c);
	}
}
