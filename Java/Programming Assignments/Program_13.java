package Programs;

/* Write a Java program to multiply 2 matrices*/

public class Program_13 {
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsFirst = firstMatrix.length;
        int columnsFirst = firstMatrix[0].length;
        int columnsSecond = secondMatrix[0].length;

        int[][] result = new int[rowsFirst][columnsSecond];

        for (int i = 0; i < rowsFirst; i++) {
            for (int j = 0; j < columnsSecond; j++) {
                for (int k = 0; k < columnsFirst; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Multiply the matrices
        int[][] result = multiplyMatrices(matrix1, matrix2);

        System.out.println("Product of the matrices:");
        printMatrix(result);
    }
}

