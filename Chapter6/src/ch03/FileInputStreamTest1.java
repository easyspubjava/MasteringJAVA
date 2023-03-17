package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {

	
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
						
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(NullPointerException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(" end");
	}

}
