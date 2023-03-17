package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student Lee = new Student(100, "Lee");
		Student Lee2 = Lee;
		Student Shun = new Student(100, "Lee");
		

		Student Lees = (Student)Lee.clone();
		
		System.out.println(Lees.toString());
		
//		System.out.println(Lee.hashCode());
//		System.out.println(Shun.hashCode());
//		
//		System.out.println(System.identityHashCode(Lee));
//		System.out.println(System.identityHashCode(Shun));
		
		
		
//		System.out.println(Lee.equals(Lee2));
//		System.out.println(Lee == Lee2);
//		
//		System.out.println(Lee.equals(Shun));
//		System.out.println(Lee == Shun);
		
//		String str1 = new String("test");
//		String str2 = new String("test");
//		
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		
	    Exception e;
		
	}

}
