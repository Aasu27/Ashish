
public class ThirdLargest {
	public static void main(String[] args) {
		int tmp=0;
		int[] ar = {6,8,2,4,7,3,1};
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		int t = ar[ar.length-3];
		System.out.println("Third Largest : " + t);
	}
}
