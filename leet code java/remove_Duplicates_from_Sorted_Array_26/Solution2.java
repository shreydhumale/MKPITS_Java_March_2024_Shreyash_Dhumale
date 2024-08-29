package remove_Duplicates_from_Sorted_Array_26;

import java.util.LinkedHashSet;
import java.util.Set;

//using Set
public class Solution2 {
	public void removeDuplicates(int arr[]) {
		Set<Integer> set=new LinkedHashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}
	public static void main(String[] args) {
		Solution2 solution= new Solution2();
		int arr[]= {12,3,3,7,7,8};
		solution.removeDuplicates(arr);
	}
}
