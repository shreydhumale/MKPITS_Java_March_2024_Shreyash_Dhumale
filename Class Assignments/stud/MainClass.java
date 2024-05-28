import stud.Student;
import java.util.Scanner;

//import stud.*;

public class MainClass{

    public static void main(String[] args) {
//        Student student=new Student();
//        student.setName("Shreyash");
//        student.setMarks(50);
//
//        Student student1=new Student();
//        student.getName();
//        student.getMarks();
//        String name=student.getName();
//        int marks=student.getMarks();
//        System.out.println("Name: " + name);
//        System.out.println("Marks: " + marks);
//        System.out.print("result: ");
//        student.getResult();

//        employee.setName("Shreyash");
//        employee.setId(836352);
//        employee.setDepartment("Testing");
//        employee.setSalary(50000);
        Student student=new Student("shreyash",80,5000);
        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Fees :" + student.getFees());
        System.out.println("****************************");

        Employee employee=new Employee("shreyash",73398,"testing", 50000);
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + employee.getSalary());


    }
}