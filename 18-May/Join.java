import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Join {
	DB_Connection dbc = new DB_Connection();
	public void join() {
		try {
			Connection c = dbc.getConnection();
			String s = "SELECT student.classno, student.name, teacher.name from student full outer join teacheron student.classno=teacher.classno";
			Statement s1 = c.createStatement();
			ResultSet r = s1.executeQuery(s);
			while(r.next()) {
				System.out.println("id : " + r.getInt("t_id") + " Name : " + r.getString("name") + " Teacher : " + r.getString("teacher_name"));
			}
		}
		catch(Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public static void main(String[] args) {
		Join j = new Join();
		j.join();
	}
}
