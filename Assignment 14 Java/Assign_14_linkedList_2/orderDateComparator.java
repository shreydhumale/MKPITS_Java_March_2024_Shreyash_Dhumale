package Assign_14_linkedList_2;

import java.util.Comparator;

public class orderDateComparator implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		return o1.getOrderDateString().compareTo(o2.getOrderDateString());
	}
	
}
