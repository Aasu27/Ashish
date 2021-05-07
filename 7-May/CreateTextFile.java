import java.io.File;
public class CreateTextFile {
	public static void main(String[] args) {
		File f = new File("Example.java");
		
		try {
			boolean b = f.createNewFile();
			if(b){
				System.out.println("File Created");
			}
			else {
				System.out.println("Already Exists");
			}
		}
		catch(Exception e) {
			System.out.println("Exception occurred:" + e);
		}
	}
}
