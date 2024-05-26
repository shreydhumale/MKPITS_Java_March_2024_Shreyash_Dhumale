package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Assign_16_7 {
public static void main(String[] args) {
	ArrayList<Integer>a1=new ArrayList<Integer>();
	a1.add(20);
	a1.add(22);
	a1.add(24);
	a1.add(26);
	Iterator<Integer>iterator=a1.iterator();
	while(iterator.hasNext()) {
		if(a1.contains(20)) 
		System.out.println(iterator.next());
	}
	System.out.println("Element found");
	}
}

