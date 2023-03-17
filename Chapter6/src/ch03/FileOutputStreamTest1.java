package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("output.txt", true);
			
		try(fos){
					
			fos.write(65);
			fos.write(66);
			fos.write(67);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
	
	}

}
