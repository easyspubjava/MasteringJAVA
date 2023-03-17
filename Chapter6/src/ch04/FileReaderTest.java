package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("reader.txt")){
			
			int i;
			while( (i = fr.read()) != -1 ) {
				System.out.print((char) i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}