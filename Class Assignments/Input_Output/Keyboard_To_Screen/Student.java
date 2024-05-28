package Keyboard_To_Screen;
import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println(name);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student student = new Student("Shreyash", 70);
        student.displayDetails();
    }
}
