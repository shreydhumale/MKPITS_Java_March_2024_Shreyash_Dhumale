package Programs;

import java.util.Collections;
import java.util.Vector;

/* Write a Java program to multiply 2 matrices*/
public class Program_15 {
	public static void main(String[] args) {
		Vector<Integer>vector=new Vector<Integer>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		
		System.out.println("original vector :"+vector);
		System.out.print("maximum element :");
		System.out.println(Collections.max(vector));
		
	}
}
