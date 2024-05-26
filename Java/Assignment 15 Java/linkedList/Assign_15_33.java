package linkedList;

import java.util.LinkedList;

public class Assign_15_33 {
		public static void main(String[] args) {
			LinkedList<Integer>l1=new LinkedList<Integer>();
			l1.add(10);
			l1.add(20);
			l1.add(30);
			l1.add(40);
			l1.get(0);
			System.out.println(l1);
			for(int i=0;i<l1.size();i++) {
				System.out.println(l1.get(i)+" index:"+i);
			}
			
		}
	}

