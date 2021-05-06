
public class FrequencyOfElement {
	public static void main(String[] args) {
		int[] ar = {1,2,2,3,4,3};
		int[] f = new int[ar.length];
		
		for(int i : ar) {
			f[i]++;
		}
		
		for(int j=0; j<f.length; j++) {
			if(f[j]>0) {
				System.out.println(j + " : " + f[j]);
			}
		}
	}
}
