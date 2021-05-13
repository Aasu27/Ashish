import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayList {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
		ArrayList<String> a2 = new ArrayList<>(Arrays.asList("B", "C", "D"));
		boolean e = a1.equals(a2);
		System.out.println(e);
	}
}
