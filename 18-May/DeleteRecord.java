import java.sql.Connection;
import java.sql.Statement;

public class DeleteRecord {
	DB_Connection dbc = new DB_Connection();
	public void delete() {
		try {
			Connection c = dbc.getConnection();
			String s = "Select from Student";
			Statement s1 = c.createStatement();
			int i = s1.executeUpdate(s);
			if(i>0) {
				System.out.println("Deleted");
			}
		}
		catch(Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public static void main(String[] args) {
		
	}
}
