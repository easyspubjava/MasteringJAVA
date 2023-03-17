package ch01;


class MyRunnable implements Runnable{

	@Override
	public void run() {
		int i;
		for(i=0; i<=200; i++) {
			System.out.print(i + "\t");
		}
		
	}
	
}

public class ThreadTest2 {

	public static void main(String[] args) {

		MyRunnable runnable = new MyRunnable();
		Thread th1 = new Thread(runnable);
		th1.start();
		
		Thread th2 = new Thread(new MyRunnable());
		th2.start();
	}

}
