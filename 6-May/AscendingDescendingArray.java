
public class AscendingDescendingArray {
	static int tmp=0;
	public static void Ascending(int[] ar) {
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		System.out.println("Ascending : ");
		for(int k=0; k<ar.length; k++) {
			System.out.print(ar[k]);
		}
	}
	
	public static void Descending(int[] ar) {
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		System.out.println("\n\nDescending : ");
		for(int k=0; k<ar.length; k++) {
			System.out.print(ar[k]);
		}
	}
	public static void main(String[] args) {
		int[] ar = {6,8,2,4,7,3,1};
		Ascending(ar);
		Descending(ar);	
	}
}
