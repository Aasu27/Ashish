import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabaseTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","password");
			Statement s = c.createStatement();
			String s1 = "CREATE TABLE STUDENT(id INTEGER NOT NULL, Name Varchar(50) NOT NULL, Std INTEGER NOT NULL, classno INTEGER NOT NULL)";
			s.executeUpdate(s1);
			System.out.println("Created");
			c.close();
		}
		catch(Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
}
