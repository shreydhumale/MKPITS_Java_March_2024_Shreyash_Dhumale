//1. Develop a program to sort elements of an array in ascending order.

import java.util.Arrays;

class Assign1{
	public static void main(String args[]){
		int arr[]={9,8,7,6,5};

		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++){
		System.out.println(i+" ");
		}
	}
}