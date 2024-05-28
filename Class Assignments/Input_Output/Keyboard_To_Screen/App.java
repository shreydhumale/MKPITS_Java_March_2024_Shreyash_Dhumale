package Keyboard_To_Screen;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = null;

        try {
            while (true) {
                System.out.println("Enter choices: 1. Add student, 2. Display, 3. Add to file, 4. read from file, 5. Exit");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter name and marks:");
                        String name = scanner.next();
                        int marks = scanner.nextInt();
                        student = new Student(name, marks);
                        break;
                    case 2:
                        if (student != null) {
                            System.out.println("Student details:");
                            System.out.println("Name: " + student.getName());
                            System.out.println("Marks: " + student.getMarks());
                        } else {
                            System.out.println("No student data available.");
                        }
                        break;
                    case 3:
                        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("abc.txt"));
                        Student student3=(Student) objectInputStream.readObject();
                        objectInputStream.close();
                        System.out.println(student3);
                        break;

                    case 4:
                        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("abc.txt"));
                        objectOutputStream.writeObject(student);
                        objectOutputStream.close();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            }
        } catch (Exception e) {
        }
    }
}
