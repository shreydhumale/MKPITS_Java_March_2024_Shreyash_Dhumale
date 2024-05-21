package assign_14_arraylist_1;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManagemantSystem {
    public ArrayList<Student> students=new ArrayList<Student>();

    public void addStudent(int id, String name, double grade) {
        students.add(new Student(id, name, grade));
    }

    public void removeStudentById(final int id) {
        Iterator <Student> iterator = students.iterator();
        while (iterator.hasNext()) {
           Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
            }
        }
    }

    public Student searchStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void displayStudents() {
    	Collections.sort(students,new nameComparator());
    	System.out.println(students);
    	Collections.sort(students,new gradeComparator());
        }
  
    public static void main(String[] args) {
        StudentManagemantSystem studentManagemantSystem = new StudentManagemantSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student by id");
            System.out.println("3. Search for a student by id");
            System.out.println("4. Display all students sorted by grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student grade: ");
                    double grade = scanner.nextDouble();
                    studentManagemantSystem.addStudent(id, name, grade);
                    break;
                case 2:
                    System.out.print("Enter student id to remove: ");
                    int removeId = scanner.nextInt();
                    studentManagemantSystem.removeStudentById(removeId);
                    break;
                case 3:
                    System.out.print("Enter student id to search: ");
                    int searchId = scanner.nextInt();
                    Student student = studentManagemantSystem.searchStudentById(searchId);
                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    studentManagemantSystem.displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
