import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeDeserialize {
	public static void main(String[] args) {
		Employee e = null;
		try {
			FileInputStream f = new FileInputStream("Employee.ser");
			ObjectInputStream o = new ObjectInputStream(f);
			e = (Employee) o.readObject();
			o.close();
			f.close();
			System.out.println("Done");
		}
		catch(Exception e1) {
			System.out.println("Exception occurred : " + e1);
		}
		System.out.print("Name : " + e.nm + ", Address : " + e.add + ", ID : " + e.id);
	}
}
