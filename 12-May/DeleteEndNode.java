import java.util.Collections;
import java.util.LinkedList;

public class DeleteEndNode {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("1");
		l.add("A");
		l.add("4");
		l.add("B");
		Collections.sort(l);
		System.out.println("List : " + l);
		l.removeLast();
		System.out.println("Updated List : " + l);
	}
}
