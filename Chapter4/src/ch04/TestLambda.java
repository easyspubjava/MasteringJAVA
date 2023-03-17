package ch04;

@FunctionalInterface
interface PrintString{
	
	public void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {

		PrintString printString = str -> System.out.println(str);
		printString.showString("hello1");
		
		showMyString(printString);
		
		PrintString myString = returnString();
		myString.showString("hello3");
	}

	public static void showMyString(PrintString str) {
		str.showString("hello2");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s + ", world");
	}
}
