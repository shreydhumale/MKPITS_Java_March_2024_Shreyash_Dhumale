package assign_16_Vector_4;

import java.util.Vector;

public class VectorManipulation {
    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>();
        Vector<Integer> vector2 = new Vector<>();

        vector1.add(2);
        vector1.add(3);
        vector1.add(4);

        vector2.add(5);
        vector2.add(6);
        vector2.add(7);

        Vector<Integer> addition = vectorAddition(vector1, vector2);
        Vector<Integer> subtraction = vectorSubtraction(vector1, vector2);

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
    }

    public static Vector<Integer> vectorAddition(Vector<Integer> vector1, Vector<Integer> vector2) {
        if (vector1.size() != vector2.size()) {
            throw new IllegalArgumentException();
        }
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i < vector1.size(); i++) {
            result.add(vector1.get(i) + vector2.get(i));
        }
        return result;
    }

    public static Vector<Integer> vectorSubtraction(Vector<Integer> vector1, Vector<Integer> vector2) {
        if (vector1.size() != vector2.size()) {
            throw new IllegalArgumentException();
        }
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i < vector1.size(); i++) {
            result.add(vector1.get(i) - vector2.get(i));
        }
        return result;
    }
}

