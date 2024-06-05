package assignment_19_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Finding_Max_and_Min {
	public static void main(String[] args) {
	List<Student>students=new ArrayList<Student>();
	students.add(new Student("rohit", 23));
	students.add(new Student("ashish", 19));
	students.add(new Student("raj", 36));
	students.add(new Student("rohit", 23));
	
	Student oldestStudent= students.stream()
			.max(Comparator.comparingInt(Student::getAge))
			.orElseThrow();
	System.out.println("oldest Student :"+oldestStudent.getNameString() +"\n"+ "age :" +oldestStudent.getAge());

	Student youngestStudent=students.stream()
			.min(Comparator.comparingInt(Student::getAge))
			.orElseThrow();
	System.out.println("youngest Student :"+youngestStudent.getNameString()+"\n"+youngestStudent.getAge());
	}	
}
