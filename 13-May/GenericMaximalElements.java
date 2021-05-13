import java.util.ArrayList;
import java.util.List;

public class GenericMaximalElements {

	public static <T extends Comparable<T>> T maximum (List<T> l, int i, int j) {
        T max = l.get(i);
        for (int k = i + 1; k < j; k++) {
            T e = l.get(k);
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList <Integer> ();
		a.add(10);
		a.add(4);
		a.add(50);
		System.out.print("Maximal Element :"+maximum(a,0,3));
	}

}