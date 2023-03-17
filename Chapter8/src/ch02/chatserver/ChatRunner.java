package ch02.chatserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChatRunner extends Thread{
	
	private boolean flag = false;
	private Socket socket;
	private BufferedReader br = null;
	private BufferedWriter bw = null;

	
	public ChatRunner(Socket socket) throws IOException {
		this.socket = socket;
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

	}
	
	public void run() {

		while(!flag) {
			
			try {
				String message = br.readLine();
				
				
				if(message != null && !message.equals("")) {
					
					ChatServer.room.sendMessageAll(message);
				}
				else {
					this.flag = true;
				}
				
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		ChatServer.room.removeChatRunner(this);
		try {
			br.close();
			bw.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	
	
	
	public void sendMessage(String message) throws IOException {
		
		bw.write(message + "\n");
		bw.flush();
		
	}
	
	public String toString() {
		return socket.toString();
	}

}
