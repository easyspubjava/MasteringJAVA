package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("output2.txt");
			
		try(fos){
					
			byte[] bs = new byte[26];
			
			byte data = 65;
			
			for(int i = 0; i <bs.length; i++) {
				bs[i] = data++;
			}
			
			fos.write(bs);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
	
	}

}
