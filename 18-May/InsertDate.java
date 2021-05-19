import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class InsertDate {
	DB_Connection dbc = new DB_Connection();
	public void date() {
		Connection c = dbc.getConnection();
		try {
			PreparedStatement ps = c.prepareStatement("Insert into student values id=?, name=?, std=?, classno=?, date=?");
			Date d = new Date(new java.util.Date().getTime());
			ps.setInt(1, 4);
			ps.setString(2, "B");
			ps.setInt(3, 3);
			ps.setInt(4, 104);
			ps.setDate(5, d);
			ps.executeUpdate();
		} 
		catch (Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public static void main(String[] args) {
		InsertDate id = new InsertDate();
		id.date();
	}
}
