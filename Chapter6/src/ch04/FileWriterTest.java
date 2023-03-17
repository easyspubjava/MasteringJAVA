package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt", true)){
			
			fw.write('A');
			
			char buf[] = {'B','C','D','E','F','G'};
			
			fw.write(buf);
			fw.write("안녕하세요. 반갑습니다.\n");
			fw.write(buf, 1, 2);
			fw.write("65");
		}
		catch( IOException e ) {
			System.out.println(e);
		}
		
		System.out.println("end");
	}

}
