import java.util.*;
class LengthMatchException extends Exception{
	LengthMatchException(String s1){
		super(s1);
	}
}
public class LenMatchException {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String:");
			String s = sc.nextLine();
			System.out.println("Enter the length:");
			int l = sc.nextInt();
			sc.close();
			
			validate(s,l);
		}
		catch(LengthMatchException lme) {
			System.out.println("Exception : " + lme);
		}
	}
	public static void validate(String s1,int l) throws LengthMatchException {
		if(s1.length() == l) {
			System.out.println("String length and entered length is same.");
		}
		else {
			throw new LengthMatchException("String length and entered length is not same.");
		}
	}
}
