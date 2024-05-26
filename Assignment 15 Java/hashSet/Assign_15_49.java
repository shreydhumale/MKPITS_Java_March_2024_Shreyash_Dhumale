package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Assign_15_49 {
	public static void main(String[] args) {
		HashSet<Integer>h1=new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(50);
		
		Iterator<Integer>iterator=h1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
