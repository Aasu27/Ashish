import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(80);
		Socket s = ss.accept();
		System.out.println("Connection...");
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "";
		while(!s1.equals("stop")) {
			s1 = dis.readUTF();
			System.out.println("Client : " + s1);
			String s2 = b.readLine();
			dos.writeUTF(s2);
			dos.flush();
		}
		dis.close();
		s.close();
		ss.close();
	}
}
