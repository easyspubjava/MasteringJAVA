package ch02.chatserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static ChatRoom room = new ChatRoom();
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(30000);
		System.out.println("chatting start...");
		
		while(true) {
			Socket socket = serverSocket.accept();
			
			ChatRunner runner = new ChatRunner(socket);
			ChatServer.room.addChatRunner(runner);
			runner.start();
		}
		
	}
}
