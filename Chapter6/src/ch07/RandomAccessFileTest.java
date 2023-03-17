package ch07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {

		try {
			RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
			
			rf.writeInt(100);
			System.out.println("파일 포인터 위치:" + rf.getFilePointer());
			rf.writeDouble(3.14);
			System.out.println("파일 포인터 위치:" + rf.getFilePointer());
			rf.writeUTF("안녕하세요");
			System.out.println("파일 포인터 위치:" + rf.getFilePointer());
			
			rf.seek(0);
			System.out.println("파일 포인터 위치:" + rf.getFilePointer());
			
			int i = rf.readInt();
			double dnum = rf.readDouble();
			String str = rf.readUTF();
			
			System.out.println("파일 포인터 위치:" + rf.getFilePointer());
			System.out.println(i);
			System.out.println(dnum);
			System.out.println(str);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
