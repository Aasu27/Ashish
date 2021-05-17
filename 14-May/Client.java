import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("localhost",80);
		System.out.println("Established....");
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "";
		while(!s1.equals("stop")) {
			s1 = b.readLine();
			dos.writeUTF(s1);
			dos.flush();
			String s2 = dis.readUTF();
			System.out.println("Server : " + s2);
			
		}
		dis.close();
		s.close();
	}
}
