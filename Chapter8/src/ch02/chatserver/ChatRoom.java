package ch02.chatserver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ChatRoom  extends ArrayList<ChatRunner>{

	
	public synchronized void addChatRunner(ChatRunner cr) {
		add(cr);
	}
	
	public synchronized void removeChatRunner(ChatRunner cr) {
		
		if(this.contains(cr)) {
			this.remove(cr);
		}
	}
	
	
	public void sendMessageAll(String message) throws IOException {
		
		Iterator<ChatRunner> ir = this.iterator();
		
		while(ir.hasNext()) {
			ChatRunner runner = ir.next();
			runner.sendMessage(message);
		}
	}
	
}
