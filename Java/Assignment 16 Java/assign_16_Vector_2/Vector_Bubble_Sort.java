package assign_16_Vector_2;

import java.util.ArrayList;

public class Vector_Bubble_Sort {
	
    public static void bubbleSort(ArrayList<Integer> vector) {
        int n = vector.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vector.get(j) > vector.get(j + 1)) {
                    int temp = vector.get(j);
                    vector.set(j, vector.get(j + 1));
                    vector.set(j + 1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList<>();
        vector.add(46);
        vector.add(75);
        vector.add(23);
        vector.add(9);
        System.out.println("before sorting :"+vector);
        bubbleSort(vector);

        System.out.println("after sorting : "+vector);
    }
}

