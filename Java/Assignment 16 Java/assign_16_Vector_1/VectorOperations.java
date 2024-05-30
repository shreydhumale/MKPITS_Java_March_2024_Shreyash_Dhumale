package assign_16_Vector_1;

import java.util.Iterator;
import java.util.Vector;

public class VectorOperations {
	Vector<Integer>vector=new Vector<Integer>();
	
	public void addVector() {
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		Iterator<Integer>iterator=vector.iterator();
		System.out.println("original Vector :");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void removeVector() {
		vector.remove(3);
		System.out.println("after removing index 3 :"+vector);
	}
	public void findSize() {
		System.out.println("size of vector : "+vector.size());
	}
	public void display() {
		addVector();
		removeVector();
		findSize();
	}
	public static void main(String[] args) {
		VectorOperations v1=new VectorOperations();
		v1.display();
	}
}
