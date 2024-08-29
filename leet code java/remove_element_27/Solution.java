package remove_element_27;

import java.util.Arrays;

class Solution {
    // Method to remove all instances of 'val' from 'nums' array
    public int removeElement(int[] nums, int val) {
        // Index for placing the next non-'val' element
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // Check if the current element is not equal to 'val'
            if (nums[j] != val) {
                // Place the non-'val' element at index 'i'
                nums[i] = nums[j];
                // Move to the next position for placing a non-'val' element
                i++;
            }
        }
        // Return the new length of the array with 'val' elements removed
        return i;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = {1, 2, 4, 5, 1, 2};
        int newLength = solution.removeElement(arr, 4);
                
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}