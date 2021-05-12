import java.util.Collections;
import java.util.Vector;

public class BinarySearchVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		int i = Collections.binarySearch(v, 3);
		System.out.println(i);
	}
}
