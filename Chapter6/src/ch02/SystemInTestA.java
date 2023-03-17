package ch02;

import java.io.IOException;

public class SystemInTestA {

	public static void main(String[] args) {

		System.out.println("알파벳 하나를 쓰고 [enter]를 누르세요");
		
		int i; 
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
