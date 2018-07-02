package chatapp.networking;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Logger;

public class MessageTransmitter extends Thread{
	
	String message, hostname;
	int port;
	
	public MessageTransmitter() {	//empty constr	
	}	
	public MessageTransmitter (String message, String hostname, int port) {
		this.message=message;
		this.hostname=hostname;
		this.port=port;
	}
	
	@Override
	public void run() {
		try {
		Socket s = new Socket(hostname, port); //soc connects to serv sock
		s.getOutputStream().write(message.getBytes());//get string as bytes. I'm not sure about it.
		s.close();
		}catch (IOException ex) {
			Logger.getLogger(MessageListener.class.getName());
		}	
	}	
}
