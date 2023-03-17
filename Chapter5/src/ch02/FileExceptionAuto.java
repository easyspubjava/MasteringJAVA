package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionAuto {

	public static void main(String[] args) {

		
		try (FileInputStream  fis = new FileInputStream("a.txt")){
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
			//return;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
