import java.util.Collections;
import java.util.Vector;

public class SwapNumbersUsingVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		Collections.swap(v, 0, 1);
		System.out.println("Swap : " + v);
	}
}
