package ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest {

	public static void main(String[] args) {

		try(InputStreamReader ir = new InputStreamReader(new FileInputStream("reader.txt"))){
			
			int i;
			while( (i = ir.read()) != -1 ) {
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
