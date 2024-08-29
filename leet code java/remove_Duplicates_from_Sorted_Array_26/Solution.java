package remove_Duplicates_from_Sorted_Array_26;

import java.util.Arrays;

public class Solution {
	public int removeDuplicate(int arr[]) {
		
		 int i=0;
	        for(int j=1; j<arr.length; j++){
	            if(arr[i] != arr[j]){
	                i++;
	                arr[i]=arr[j];
	            }
	        }
	        return i+1;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int arr[]= {12,23,45,56,23};
		Arrays.sort(arr);
		
		solution.removeDuplicate(arr);
		for(int i=0; i< arr.length; i++) {
		System.out.println(arr[i] + " ");
		}
	}
}
