package javabasicanna.homeworks.lecture8;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the matrix
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        // Create the original matrix
        int[][] originalMatrix = new int[M][N];

        // Create the transposed matrix
        int[][] transposedMatrix = new int[N][M];

        // Input the elements of the original matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                originalMatrix[i][j] = scanner.nextInt();
            }
        }

        // Transpose the matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }
        // Print the original matrix
        System.out.println("The original matrix is:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println();
        }
        // Print the transposed matrix
        System.out.println("The transposed matrix is:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
