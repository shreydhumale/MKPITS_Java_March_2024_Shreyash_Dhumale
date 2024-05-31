package assign_16_Vector_2;

import java.util.ArrayList;

public class Vector_Selection_Sort {
	
	    public static void selectionSort(ArrayList<Integer> vector) {
	        int n = vector.size();
	        for (int i = 0; i < n - 1; i++) {
	            int smallest = i;
	            for (int j = i + 1; j < n; j++) {
	                if (vector.get(j) < vector.get(smallest)) {
	                    smallest = j;
	                }
	            }
	            int temp = vector.get(i);
	            vector.set(i, vector.get(smallest));
	            vector.set(smallest, temp);
	        }
	    }
	    public static void main(String[] args) {
	        ArrayList<Integer> vector = new ArrayList<>();
	        vector.add(22);
	        vector.add(7);
	        vector.add(89);
	        vector.add(11);
	        vector.add(9);
	        System.out.println("Before sorting : "+vector);
	        selectionSort(vector);

	        System.out.println("After sorting : " + vector);
	    }

}


    

