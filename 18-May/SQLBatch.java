import java.sql.Connection;
import java.sql.Statement;

public class SQLBatch {
	DB_Connection dbc = new DB_Connection();
	public void batch() {
		try {
			Connection c = dbc.getConnection();
			c.setAutoCommit(false);
			Statement s = c.createStatement();
			s.addBatch("insert into student(id, name, std, classno) values (3, 'A', 5, 103)");
			s.executeBatch();
			c.commit();
		}
		catch(Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public static void main(String[] args) {
		SQLBatch b = new SQLBatch();
		b.batch();
		System.out.println("Added");
	}
}
