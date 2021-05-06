
public class LargeSmallWord{
	public static void smallest(String words[]) {
	    if (words == null || words.length < 1) {
	        System.out.println("");
	    }
	    String smallest = words[0];
	    for (int i = 1; i < words.length; i++) {
	        if (words[i].length() < smallest.length()) {
	            smallest = words[i];
	        }
	    }
	    System.out.println("Smallest : " + smallest);
	}
	
	public static void largest(String words[]) {
	    if (words == null || words.length < 1) {
	        System.out.println("");
	    }
	    String largest = words[0];
	    for (int i = 1; i < words.length; i++) {
	        if (words[i].length() > largest.length()) {
	            largest = words[i];
	        }
	    }
	    System.out.println("Largest : " + largest);
	}
	
	public static void main(String[] args) {
		String[] words = {"I","am","Ironman"};
		smallest(words);
		largest(words);
	}
}