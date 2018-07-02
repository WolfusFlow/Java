import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;


class Client{
  public static void main(String agrs[]) throws Exception{
     Socket s = new Socket("localhost",4444);
     DataInputStream dis = new DataInputStream(s.getInputStream());
     String msg=dis.readUTF();
     System.out.println(msg);
  }
}