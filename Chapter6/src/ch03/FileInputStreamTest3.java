package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			
			byte[] bs = new byte[10];
			int i;
			
			while( (i = fis.read(bs) )  != -1) {
				
				for( int k = 0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				
				System.out.println(" : " + i + " bytes read");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
