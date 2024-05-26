package Assign_14_linkedList_1;

import java.util.Comparator;

public class dueDateComparator implements Comparator<Task>{

	@Override
	public int compare(Task o1, Task o2) {
		return o1.getDuedateString().compareTo(o2.getDuedateString());
	}

}