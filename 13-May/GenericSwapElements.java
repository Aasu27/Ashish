import java.util.Arrays;

public class GenericSwapElements {
	public static void main(String[] args) {
		Integer[] i = {1, 2, 3, 4};
		swap(i, 2, 3);
		System.out.println(Arrays.toString(i));
	}
	private static<T> void swap(T[] i1, int j, int k) {	
		T tmp = i1[j];
		i1[j] = i1[k];
		i1[k] = tmp;
	}
}
