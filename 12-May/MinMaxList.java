import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxList {
	public static Integer getMax(List<Integer> l) {
		Integer max = Integer.MIN_VALUE;
		for(Integer i:l) {
			if(max<i) {
				max = i;
			}
		}
		return max;
	}
	public static Integer getMin(List<Integer> l) {
		Integer min = Integer.MAX_VALUE;
		for(Integer j:l) {
			if(min>j) {
				min = j;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>(Arrays.asList(9,4,6,10,1,7));
		System.out.println("Max : " + getMax(l));
		System.out.println("Min : " + getMin(l));
	}
}
