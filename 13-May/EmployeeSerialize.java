import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerialize {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.nm = "A";
		e.add = "Surat";
		e.id = 101;
		try {
			FileOutputStream f = new FileOutputStream("Employee.ser");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(e);
			o.close();
			f.close();
			System.out.println("Done");
		}
		catch(Exception e1) {
			System.out.println("Exception occurred : " + e1);
		}
	}
}
