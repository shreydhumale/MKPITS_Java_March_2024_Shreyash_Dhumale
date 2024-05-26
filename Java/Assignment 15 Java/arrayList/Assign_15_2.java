package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Assign_15_2 {
	public static void main(String[] args) {
	ArrayList<Integer>a1=new ArrayList<Integer>();
	a1.add(10);
	a1.add(12);
	a1.add(14);
	a1.add(16);
	Iterator<Integer>iterator=a1.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	}
}
