import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertReadImage {
	DB_Connection dbc = new DB_Connection();
	public void insert() {
		try {
			Connection c = dbc.getConnection();
			PreparedStatement ps = c.prepareStatement("insert into img values(?,?)");
			ps.setString(1, "A");
			FileInputStream fis = new FileInputStream("E:\\Programs\\A.jpg");
			ps.setBinaryStream(2, fis, fis.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records");
		}
		catch(Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public void read() {
		Connection c = dbc.getConnection();
		PreparedStatement ps;
		try {
			ps = c.prepareStatement("Select * from img");
			ResultSet r = ps.executeQuery();
			if(r.next()) {
				Blob b = r.getBlob(2);
				byte b1[] = b.getBytes(1, (int)b.length());
				FileOutputStream fos = new FileOutputStream("E:\\Programs");
				fos.write(b1);
				fos.close();
			}
		} catch (Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public static void main(String[] args) {
		InsertReadImage iri = new InsertReadImage();
		iri.insert();
		iri.read();
	}
}
