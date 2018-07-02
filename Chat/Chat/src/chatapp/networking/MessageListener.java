package chatapp.networking;

import java.net.*;
import java.io.*;
import java.util.logging.*;

public class MessageListener extends Thread{
	
	ServerSocket server;
	int port = 8877;
	WritableGUI gui;
	
	public MessageListener(WritableGUI gui, int port) {
		this.port=port;	
		this.gui = gui;
		try {
		server = new ServerSocket(port);
		} catch(IOException ex) {  //found the solution for exception work here | So it's about util
			Logger.getLogger(MessageListener.class.getName()); //need to change it and learn more about this logger stuff
		}		
	}
	public MessageListener() {
		try {
		server = new ServerSocket(port);
		}catch (IOException ex) {
			Logger.getLogger(MessageListener.class.getName());
		}		
	}
	
	@Override  
	public void run() {
		Socket clientSocket; 
		try {
		while((clientSocket = server.accept()) !=null) { //accepting connection
			//taking data
			InputStream is = clientSocket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));//input stream from client to buffer to stream
			String line = br.readLine();
			if(line != null) {
				gui.write(line); //using gui interface to write data
			}
		}
		 }catch(IOException ex) {
			
		}
	}

}
