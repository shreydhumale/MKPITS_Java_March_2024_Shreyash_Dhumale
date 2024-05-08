5. Matrix Multiplication:
   Write a Java program to multiply two matrices of size m×n and n×p. The program should take the dimensions and elements of the two matrices as input from the user and output the resulting matrix after multiplication.



package Assignment8Java;

import java.util.Scanner;

class MatrixMultiplication {
    public int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        int p = matrixB[0].length;

        int[][] resultMatrix = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return resultMatrix;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows of the first matrix: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int n = scanner.nextInt();

        int[][] matrixA = new int[m][n];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the number of columns of the second matrix: ");
        int p = scanner.nextInt();

        int[][] matrixB = new int[n][p];

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
        int[][] resultMatrix = matrixMultiplication.multiplyMatrices(matrixA, matrixB);

        System.out.println("Resultant matrix after multiplication:");
        for (int[] row : resultMatrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}



