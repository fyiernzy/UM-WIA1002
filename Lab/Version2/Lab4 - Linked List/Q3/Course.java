package Lab4.Q3;

public class Course {
	private String courseCode;
	private String courseName;
	private int creditHour;
	private char grade;
	
	public Course(String courseCode, String courseName, int creditHour, char grade) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.creditHour = creditHour;
		this.grade = grade;
	}
	
	public int getCreditHour() {
		return creditHour;
	}
	public String getCourseCode() {
		return courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public char getGrade() {
		return grade;
	}
	
	public int getPoint() {
		switch(grade) {
		case 'A' : return 4;
		case 'B' : return 3;
		case 'C' : return 2;
		case 'D' : return 1;
		case 'E' : return 0;
		default : return -1;
		}
	}

	public String toString() {
		return String.format("Course : %s (%s) - %d credit hours. Grade : %c -->", 
				courseCode, courseName, creditHour, grade);
	}
	
}
