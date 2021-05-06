
public class RightRotation {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4};
		int l = ar[ar.length-1];
		
		for(int i=ar.length-1; i>0; i--) {
			ar[i] = ar[i-1];
		}
		ar[0] = l;
		
		for(int j=0; j<ar.length; j++) {
			System.out.println(ar[j]);
		}
	}
}
