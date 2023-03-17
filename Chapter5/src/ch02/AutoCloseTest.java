package ch02;

public class AutoCloseTest {

	public static void main(String[] args) {

		AutoCloseObj obj = new AutoCloseObj();
	
		try (obj){
			
			throw new Exception();
			
		} catch (Exception e) {
			System.out.println("error");
		}
	}
	
}
