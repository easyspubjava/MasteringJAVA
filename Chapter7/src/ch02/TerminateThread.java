package ch02;

import java.io.IOException;

public class TerminateThread extends Thread{
	
	
	private boolean flag = false;
	int i;
	
	public TerminateThread(String name) {
		
		super(name);
	}

	public void run() {
		
		while(!flag) {
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + " end");
		
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
	public static void main(String[] args) throws IOException {
		

		TerminateThread threadA = new TerminateThread("ThreadA");
		TerminateThread threadB = new TerminateThread("ThreadB");
		TerminateThread threadC = new TerminateThread("ThreadC");
		
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;
		while(true){
			
			in = System.in.read();
			if ( in == 'A' || in == 'a'){
				threadA.setFlag(true);
			}else if(in == 'B'){
				threadB.setFlag(true);
			}else if( in == 'C'){
				threadC.setFlag(true);
			}else if( in == 'M'){
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}else if (in == '\n' ){
				;
			}
			else {
				System.out.println("type again");
			}
		}
		
		System.out.println("main end");
		
	}

}
