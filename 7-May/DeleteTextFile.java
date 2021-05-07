import java.io.File;

public class DeleteTextFile {
	public static void main(String[] args) {
		File f = new File("Example.java");
		boolean b = f.delete();
		if(b) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not Exists");
		}
	}
}
