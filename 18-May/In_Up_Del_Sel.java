import java.util.*;
import java.sql.*;
public class In_Up_Del_Sel {
	DB_Connection dbc = new DB_Connection();
	public void insert() {
		try {
			Connection c = DB_Connection.getConnection();
			String in = "INSERT INTO STUDENT(id, Name, Std, classno) VALUES (1, 'Ashish', 9, 101),(2, 'Aasu', 8, 102)";
			Statement s = c.createStatement();
			int i = s.executeUpdate(in);
			if(i>0) {
				System.out.println(i + " added");
			}
		}
		catch(Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public void update(int id, String name, int std, int classno) {
		try {
			Connection c = dbc.getConnection();
			String up = "UPDATE STUDENT SET Name=?, Std=?, classno=? WHERE id=?";
			PreparedStatement ps = c.prepareStatement(up);
			ps.setString(1, name);
			ps.setInt(2, std);
			ps.setInt(3, classno);
			ps.setInt(4, id);
			int j = ps.executeUpdate();
			if(j>0) {
				System.out.println("Updated");
			}
		}
		catch(Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public void delete(int i1) {
		try {
			Connection c = dbc.getConnection();
			String del = "DELETE FROM STUDENT Where id=?";
			PreparedStatement ps = c.prepareStatement(del);
			ps.setInt(1, i1);
			int k = ps.executeUpdate();
			if(k>0) {
				System.out.println("Deleted");
			}
		}
		catch(Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public void select() {
		try {
			Connection c = dbc.getConnection();
			String sel = "SELECT * FROM STUDENT";
			Statement s = c.createStatement();
			ResultSet r = s.executeQuery(sel);
			while(r.next()) {
				System.out.println("id : " + r.getInt("id") + ", Name : " + r.getString("name") + ", Std : " + r.getInt("std") + ", ClassNo : " + r.getInt("classno"));
			}
		}
		catch(Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		while(true) {
			System.out.print("\n1-For Insert\n2-For Update\n3-For Delete\n4-For Select\nEnter the choice : ");
			int c = s1.nextInt();
			In_Up_Del_Sel iuds = new In_Up_Del_Sel();
			switch(c) {
			case 1:
				iuds.insert();
				break;
				
			case 2:
				System.out.print("Enter id : ");
				int i = s1.nextInt();
				System.out.print("Enter Name : ");
				String n = s1.next();
				System.out.print("Enter Std : ");
				int s = s1.nextInt();
				System.out.print("Enter ClassNo : ");
				int c1 = s1.nextInt();
				iuds.update(i, n, s, c1);
				break;
				
			case 3:
				System.out.print("Enter id : ");
				int i1 = s1.nextInt();
				iuds.delete(i1);
				break;
				
			case 4:
				iuds.select();
				break;
				
			default: 
				System.out.print("Invalid");
				break;
			}
		}
	}
}
