package ch01;


class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InnerClass inClass;
	
	public OutClass() {
		inClass = new InnerClass();
	}
	
	class InnerClass{  //인스턴스 inner class
		
		int inNum = 100;
		static int sInNum = 200; 
		
		void inTest() {
			
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 정적 변수)");
		}
		
		static void sTest() {
			//System.out.println("inner static method inNum =  " + inNum);
			System.out.println("inner static method sInNum =  " + sInNum);
		}
	}
	
	public void usingInClass() {
	
		inClass.inTest();
	}
	
	static class InStaticClass{
		
		int inNum = 500;
		static int sInNum = 700;
		
		void inTest() {
			
			//num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)"); 
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			
		}
		
		static void sTest() {
			
			//num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
			//inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음
			
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
		}
	}
	
}





public class InnerTest {

	public static void main(String[] args) {

//		OutClass outer = new OutClass();
//		outer.usingInClass();
//		
//		
//		System.out.println(OutClass.InnerClass.sInNum);
//		OutClass.InnerClass.sTest();
//		
//		OutClass.InnerClass innerClass = outer.new InnerClass();
//		innerClass.inTest();
		
		
		OutClass.InStaticClass.sTest();
		System.out.println("===================");
		OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
		inStaticClass.inTest();
	}

}
