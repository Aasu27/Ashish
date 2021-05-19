import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CommitRollback {
	public static void main(String[] args) throws SQLException {
		DB_Connection dbc = new DB_Connection();
		Connection c = dbc.getConnection();
		c.setAutoCommit(false);
		try {
			Statement s = c.createStatement();
			String s1 = "Insert into student(id, name, std, classno) values (4, 'B', 6, 104)";
			s.executeUpdate(s1);
			String s2 = "Insert into teacher(classno, name, age) values (104, 'C', 35)";
			s.executeUpdate(s2);
			c.commit();
			System.out.println("Inserted");
		}
		catch(Exception e) {
			c.rollback();
			System.out.println("Exception occurred " + e);
		}
	}
}
