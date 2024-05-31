package assign_16_Vector_3;

import java.util.ArrayList;

public class Vector_LinearSearch {

    public static int linearSearch(ArrayList<Integer> vector, int target) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == target) {
                return i; 
            }
        }
        return -1;
    }
	public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        int ElementToSearch = 20; 
        int result = linearSearch(vector, ElementToSearch);

        if (result != -1) {
            System.out.println("Element found at :" + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
