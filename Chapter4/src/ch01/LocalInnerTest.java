package ch01;



class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	
	Runnable getRunnable(int i) {
		
		int localNum = 10;
				
		class MyRunnable implements Runnable{

			int localClassNum = 5;
			
			@Override
			public void run() {

				
				//i = 100;
				//localNum = 50;
				
				System.out.println("i =" + i); 
				System.out.println("localNum = " +localNum);  
				System.out.println("localClassNum = " +localClassNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
			}
			
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		
		Outer out = new Outer();
		Runnable runnable = out.getRunnable(100);
		
		runnable.run();
		
	}

}
