package ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("reader.txt")){
			
			int i;
			while( (i = fis.read()) != -1 ) {
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
