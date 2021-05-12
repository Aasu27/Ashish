import java.util.HashMap;

public class IterateHashMap {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Html", "Web-Design");
		hm.put("Javascript", "Front-End");
		System.out.print(hm);
		
		System.out.print("\n");
		for(String v:hm.values()) {
			System.out.print(v);
			System.out.print(", ");
		}
	}
}
