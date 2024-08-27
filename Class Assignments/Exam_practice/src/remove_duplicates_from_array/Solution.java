package remove_duplicates_from_array;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr); 
        
        int i= 0; 
        
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) { 
                i++; 
                arr[i] = arr[j]; 
            }
        }
        
        return i + 1;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,2,1,4,5};
        
        int newLength = solution.removeDuplicates(arr);
        
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
