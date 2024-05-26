package assign_15_HashSet_5;

import java.util.HashSet;
import java.util.Scanner;


public class UniqueCourseEnrollment {
	HashSet<String> courses=new HashSet<String>();
	HashSet<String> code =new HashSet<String>();
	
	public void addCourse(String course,String courseCode) {
		courses.add(course);
		code.add(courseCode);
	}
	
	public boolean checkCourseCode(String corseCode) {
		return code.contains(corseCode);
	}
	
	public void removeCourse(String courseCode) {
		code.remove(courseCode);
	}
	public void displayCourses() {
//		for(String code:code) {
//			System.out.println("course name :"+courses+"course code :"+code);
//			
//		}
		for(int i=0;i<courses.size()-1;i++) {
			System.out.println("course name :"+courses+"course code :"+code);
		}
	}
	
	public static void main(String[] args) {
        UniqueCourseEnrollment U1= new UniqueCourseEnrollment();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nUnique Course Enrollment");
            System.out.println("1. Add a new course code");
            System.out.println("2. Check if a course code exists in the collection");
            System.out.println("3. Remove course code ");
            System.out.println("4. Display all unique course codes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch(choice) {

            case 1:
                System.out.print("Enter course name: ");
                String courseName = scanner.nextLine();
                System.out.print("Enter course code: ");
                String courseCode = scanner.nextLine();
                U1.addCourse(courseName, courseCode);
                System.out.println("Course added successfully.");
                break;
                
            case 2: 
                System.out.print("Enter course code to check if the code exists ");
                String codeToCheck = scanner.nextLine();
                if (U1.checkCourseCode(codeToCheck)) {
                    System.out.println("code exists");
                } else {
                    System.out.println("course does not");
                }
                break;
                
            case 3:
                System.out.print("Enter course code to remove: ");
                String codeToRemove = scanner.nextLine();
                U1.removeCourse(codeToRemove);
                break;
                
            case 4:
                U1.displayCourses();;
                break;
                
            case 5:
                System.out.println("Exiting...");
                scanner.close();
                break;
                
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
}
	}
	
	}
	
}
