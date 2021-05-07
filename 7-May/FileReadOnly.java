import java.io.File;

public class FileReadOnly {
	public static void main(String[] args) {
		File f = new File("D:\\Example1.txt");
		f.setReadOnly();
	}
}
