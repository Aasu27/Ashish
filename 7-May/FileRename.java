import java.io.File;

public class FileRename {
	public static void main(String[] args) {
		File f = new File("Example.java");
		File f1 = new File("Example1.java");
		boolean b = f.renameTo(f1);
		if(b) {
			System.out.println("Changed");
		}
		else {
			System.out.println("Not Changed");
		}
	}
}
