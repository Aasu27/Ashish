
public class ArrayCopy {
	public static void main(String[] args) {
		char[] ar = {'a','b','c','d'};
		char[] arr = new char[ar.length];
		
		for(int i=0; i<ar.length; i++) {
			arr[i] = ar[i];
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]);
		}
	}
}
