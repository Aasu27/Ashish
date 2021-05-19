import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteSelect {
	DB_Connection dbc = new DB_Connection();
	public void select() {
		try {
			Connection c = dbc.getConnection();
			String s = "Select * from student";
			Statement s1 = c.createStatement();
			ResultSet r = s1.executeQuery(s);
			while(r.next()) {
				System.out.println("id : " + r.getInt("id") + ", Name : " + r.getString("name") + ", Std : " + r.getInt("std") + ", ClassNo : " + r.getInt("classno"));
			}
		}
		catch(Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public static void main(String[] args) {
		ExecuteSelect es = new ExecuteSelect();
		es.select();
	}
}
