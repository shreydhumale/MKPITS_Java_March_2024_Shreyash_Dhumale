package arrayList;

import java.util.ArrayList;

public class Assign_15_13 {
public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		ArrayList<Integer>a2=new ArrayList<Integer>();

		a1.add(10);
		a1.add(13);
		a1.add(17);
		a1.add(19);
		
		a2.add(10);
		a2.add(13);
		a2.add(17);
		a2.add(19);
		
	if(a1.equals(a2)==true) {
		System.out.println("Arraylist is equal");
	}
	else {
		System.out.println("Arraylist not equal");
	}
}
}
