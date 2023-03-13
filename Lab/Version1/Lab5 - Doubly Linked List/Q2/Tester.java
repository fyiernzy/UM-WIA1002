package Lab5.Q2;

import java.util.Scanner;
public class Tester {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		SinglyLinkedList<String> nameList = new SinglyLinkedList<>();
		setNameList(nameList);
		rename(nameList);
		removeStudent(nameList);
		System.out.println("\nAll students data captured complete. Thank you!");
	}
	
	public static void setNameList(SinglyLinkedList<String> nameList) {
		System.out.println("Enter your student name list. Enter 'n' to end......");
		
		while(true) {
			String input = scanner.nextLine();
			if(input.equals("n"))
				break;
			
			nameList.add(input);
		}
		
		System.out.println("\nYou have entered the following students' name :");
		nameList.printList();
		System.out.println("\nThe number of students entered is : " + nameList.getSize());
	}
	
	public static void rename(SinglyLinkedList<String> nameList) {
		System.out.println("\nAll the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed");
		
		if(scanner.nextLine().equals("r")) {
			System.out.println("\nEnter the existing student name that u want to rename : ");
			String oldName = scanner.nextLine();
			
			System.out.println("\nEnter the new name : ");
			String newName = scanner.nextLine();
			
			nameList.replace(oldName, newName);
			System.out.println("\nThe new student list is : ");
			nameList.printList();
		}
	}
	
	public static void removeStudent(SinglyLinkedList<String> nameList) {
		System.out.println("\nDo you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed");
		
		if(scanner.nextLine().equals("y")) {
			System.out.println("\nEnter a student name to remove : ");
			String removedName = scanner.nextLine(); 
			nameList.removeElement(removedName);
			
			System.out.println("\nThe number of updated student is : " + nameList.getSize());
			System.out.println("\nThe updated student list is : ");
			nameList.printList();
		}
		
	}
}
