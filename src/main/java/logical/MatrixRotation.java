package logical;

import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Get the number of rows and columns for the matrix
        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns:");
        System.out.println();
        int columns = scanner.nextInt();

// Create the matrix
        int[][] matrix = new int[rows][columns];

// Get the matrix elements from the user
        System.out.println("Enter the matrix elements:"); // 1 2 3
        for (int i = 0; i < rows; i++) {                  // 4 5 6
            for (int j = 0; j < columns; j++) {           // 7 8 9
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

// Rotate the matrix 90 degrees clockwise
        int[][] rotatedMatrix = rotateMatrixClockwise(matrix);

// Print the rotated matrix
        System.out.println("Rotated matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(rotatedMatrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    // Function to rotate the matrix 90 degrees clockwise
    public static int[][] rotateMatrixClockwise(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] rotatedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }
}