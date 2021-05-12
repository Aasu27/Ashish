import java.util.Collections;
import java.util.Vector;

public class VectorCopy {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		
		Vector<String> v2 = new Vector<String>();
		v2.add("E");
		v2.add("F");
		v2.add("G");
		v2.add("H");
		
		System.out.println("Before : " + v2);
		Collections.copy(v2, v1);
		System.out.println("After : " + v2);
	}
}
