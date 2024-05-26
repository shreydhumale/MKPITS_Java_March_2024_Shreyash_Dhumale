package hashSet;

import java.util.TreeSet;

public class Assign_15_56 {
	public static void main(String[] args) {
		TreeSet<Integer>t1=new TreeSet<Integer>();
		t1.add(6);
		t1.add(30);
		t1.add(20);
		t1.add(40);

		TreeSet<Integer> treeSet = (TreeSet<Integer>) t1.headSet(7);
		System.out.println(treeSet);
	}
}
