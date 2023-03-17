package ch04;

public class TestStringConcat {

	public static void main(String[] args) {
		
		int num = 100;

		String s1 = "hello";
		String s2 = "world";
		
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		
		StringConcat concat2 = (str1, str2)-> {
			
			
			System.out.println(str1 + "," + str2);
			System.out.println(num);
		};
		
		concat2.makeString(s1, s2);
		
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				
			
				System.out.println(s1 + "," + s2);
				System.out.println(num);
			}
		};
		
		concat3.makeString(s1, s2);
	}

}
