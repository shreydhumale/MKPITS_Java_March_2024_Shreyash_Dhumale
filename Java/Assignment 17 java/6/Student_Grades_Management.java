package assignment_17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student_Grades_Management{
    public static void main(String[] args) {
        HashMap<String, Double> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Grades Management System:");
            System.out.println("1. Add/Update student grade");
            System.out.println("2. Delete student grade");
            System.out.println("3. Retrieve student grade");
            System.out.println("4. Display all student grades");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: 
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    double grade = scanner.nextDouble();
                    studentGrades.put(name, grade);
                    System.out.println("Student grade added/updated successfully.");
                    break;

                case 2:
                    System.out.print("Enter student name to delete: ");
                    String deleteName = scanner.nextLine();
                    if (studentGrades.remove(deleteName) != null) {
                        System.out.println("Student grade deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to retrieve: ");
                    String retrieveName = scanner.nextLine();
                    Double retrievedGrade = studentGrades.get(retrieveName);
                    if (retrievedGrade != null) {
                        System.out.println(retrieveName +":"+ retrievedGrade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("All student grades:");
                    for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
