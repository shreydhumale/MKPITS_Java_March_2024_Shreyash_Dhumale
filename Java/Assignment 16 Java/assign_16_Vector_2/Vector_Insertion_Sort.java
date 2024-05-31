package assign_16_Vector_2;

import java.util.ArrayList;

public class Vector_Insertion_Sort {

    public static void insertionSort(ArrayList<Integer> vector) {
        int n = vector.size();
        for (int i = 1; i < n; ++i) {
            int key = vector.get(i);
            int j = i - 1;
            
            while (j >= 0 && vector.get(j) > key) {
                vector.set(j + 1, vector.get(j));
                j = j - 1;
            }
            vector.set(j + 1, key);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList<>();
        vector.add(94);
        vector.add(5);
        vector.add(44);
        vector.add(27);
        vector.add(11);
        System.out.println("Before sorting :" +vector);

        insertionSort(vector);

        System.out.println("After sorting :" + vector);
    }
}
