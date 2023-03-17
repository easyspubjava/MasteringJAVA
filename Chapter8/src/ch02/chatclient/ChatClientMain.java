package ch02.chatclient;

import java.io.IOException;

public class ChatClientMain {

	public static void main(String[] args) throws IOException {

		ChatClient client;
		String nickname = "winter";
		
		client = new ChatClient(nickname, "localhost", 30000);
		client.setSize(300, 200);
		client.setTitle(nickname);
		client.setVisible(true);
	}

}
