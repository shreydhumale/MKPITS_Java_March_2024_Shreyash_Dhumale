package hashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Assign_15_55 {
	public static void main(String[] args) {
				HashSet<Integer>h1=new HashSet<Integer>();
				h1.add(10);
				h1.add(20);
				h1.add(30);
				h1.add(40);
				h1.add(50);
				TreeSet<Integer> treeSet=new TreeSet<Integer>(h1);
				System.out.println(treeSet);

	}
}
