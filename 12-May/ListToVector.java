import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListToVector {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		Vector<String> v = new Vector<>(l);
		System.out.print("Vector : " + v);
	}
}
