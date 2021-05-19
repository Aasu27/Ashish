import java.sql.Connection;
import java.sql.DriverManager;
public class DB_Connection {
	public static Connection getConnection() {
		Connection c = null;
        try {
        	String s = "jdbc:mysql://localhost:3306/db";
        	Class.forName("com.mysql.jdbc.Driver");
        	c = DriverManager.getConnection(s,"root","password");
        	System.out.println("Connected");
        }
        catch(Exception e) {
        	System.out.println("Exception occurred " + e);
        }
		return c;
    }
	public static void main(String[] args) {
		getConnection();
	}
}