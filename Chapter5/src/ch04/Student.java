package ch04;

public class Student {

	private String studentName;
	
	public Student(String studentName) {
		
		
		if( studentName == null) {
			throw new StudentNameFormatException("name must not be null");
		}
		
		if( studentName.split(" ").length > 3) {
			throw new StudentNameFormatException("name is too long");
		}
		
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
}