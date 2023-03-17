package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClientMain {

	public static void main(String[] args) {

		
		try {
			Socket socket = new Socket("localhost", 50000);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			bw.write("Hello, JAVA + \n");
			bw.flush();
			
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			bw.close();
			br.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
