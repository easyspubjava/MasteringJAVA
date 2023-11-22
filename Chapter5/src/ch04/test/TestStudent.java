package ch04.test;

import ch04.Student;
import junit.framework.TestCase;

public class TestStudent extends TestCase{

	
	public void testStudent() {
		Student studentKim;
		
		try {
			studentKim = new Student("Kim TEST ");
		}catch(Exception e) {
			assertEquals(e.getMessage(), "name is too long");
		}
		
		Student studentLee;
		try {
			studentLee = new Student(null);
		}catch(Exception e) {
			assertEquals(e.getMessage(), "name must not be null");
		}
		
		Student studentPark = new Student("Park");
		assertEquals(studentPark.getStudentName(), "Park");
		
		
	}
}
