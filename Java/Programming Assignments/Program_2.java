package Programs;

import java.util.Arrays;

public class Program_2 {
	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		
		Arrays.sort(arr);
		
		//calculate minimum sum
		int minSum=0;
		for(int i=0;i<4;i++) {
			minSum+=arr[i];
		}
		//calculate maximum sum
		int maxSum=0;
		for(int i=1;i<5;i++) {
			maxSum+=arr[i];
		}
		System.out.println("minimum sum :" +minSum);
		System.out.println("maximum sum :" +maxSum);
	}
}
