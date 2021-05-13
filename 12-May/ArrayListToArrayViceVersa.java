import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayViceVersa {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("A");
		a.add("B");
		System.out.println("ArrayList : " + a);
		String[] ar = new String[a.size()];
		a.toArray(ar);
		System.out.print("Array : ");
		for(String s:ar) {
			System.out.print(s + " ");
		}
		List<String> a2 = new ArrayList<>();
		a2 = Arrays.asList(ar);
		System.out.print("\nArrayList : " + a2);
	}
}
