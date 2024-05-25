package linkedList;

import java.util.LinkedList;

public class Assign_15_32 {
	
	public static void main(String[] args) {
		  LinkedList<Integer> l1=new LinkedList<Integer>();
		  
		  l1.add(78);
		  l1.add(1);
		  l1.add(1);
		  l1.add(2);
		  l1.add(1);
		  l1.add(3);
		  l1.add(1);
		  l1.add(1);	  
		  l1.add(l1.size(),45);
		
		  int lastindex=-1;
		  for (int i = 0; i < l1.size(); i++) {
			if (l1.get(i)==1) {
				System.out.println(" first index"+i);
				break;
			}
		  }	 
		  for (int i = 0; i < l1.size(); i++) {
				if (l1.get(i)==1) {
					lastindex=i+1;
				}
			  }	
		  System.out.println("lastindex "+lastindex);
	}	
	}
