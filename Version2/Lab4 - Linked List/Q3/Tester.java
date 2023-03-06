package Lab4.Q3;

import java.util.LinkedList;

public class Tester {
	public static void main(String[] args) {
		LinkedList<Course> list = new LinkedList<>();
		list.add(new Course("WXX101", "Programming", 5, 'B'));
		list.add(new Course("WXX201", "Networking", 4, 'C'));
		list.add(new Course("WXX301", "Operating System", 3, 'A'));
		
		System.out.println("The list consist of ");
		
		int totalPoint = 0;
		int totalCredit = 0;
		
		for(Course course : list) {
			System.out.println(course);
			totalPoint += course.getCreditHour() * course.getPoint();
			totalCredit += course.getCreditHour();
		}
		
		System.out.println("Total point is " + totalPoint);
		System.out.println("Total credit is " + totalCredit);
		System.out.printf("Grade point average is %.2f\n", getAveragePoint(totalPoint, totalCredit));
	}
	
	public static double getAveragePoint(int totalPoint, int totalCredit) {
		return totalPoint / (double) totalCredit;
	}
}
