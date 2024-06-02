package assign_16_Stack_5;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] input1 = {12,13,14,15};
        
        int[] result1 = findNextGreaterElement(input1);
        
        System.out.println("Next greater elements:");
        printArray(result1);
   
    }

    public static int[] findNextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        
        return result;
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
