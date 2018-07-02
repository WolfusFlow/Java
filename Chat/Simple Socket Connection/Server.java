import java.io.*;
import java.net.*;

class Server{
	public static void main(String args[]) throws Exception {
		 ServerSocket soc= new ServerSocket(4444);
	      Socket s = soc.accept();
	      DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	      dos.writeUTF("Server");
	}
}