
public class GenericDifferentArrays {
	public static <E> void display(E[] input) {
		for(E element:input) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] a = {1, 2, 3};
		Double[] a1 = {1.1, 1.2, 1.3};
		Character[] a2 = {'I', 'N', 'D', 'I', 'A'};
		display(a);
		display(a1);
		display(a2);
	}
}
