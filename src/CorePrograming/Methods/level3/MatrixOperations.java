package CorePrograming.Methods.level3;

import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1; // Random numbers 1-10
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to add two matrices
    public static double[][] addMatrices(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtractMatrices(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = a[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = a[i][j];
        return transposed;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if(det == 0) {
            System.out.println("Inverse does not exist (determinant is 0)");
            return null;
        }
        double[][] inv = {
                { m[1][1]/det, -m[0][1]/det },
                { -m[1][0]/det, m[0][0]/det }
        };
        return inv;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if(det == 0) {
            System.out.println("Inverse does not exist (determinant is 0)");
            return null;
        }
        double[][] inv = new double[3][3];
        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1])/det;
        inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2])/det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1])/det;

        inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2])/det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0])/det;
        inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2])/det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0])/det;
        inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1])/det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0])/det;

        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matrix Operations Program\n");
        System.out.print("Enter rows for matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter columns for matrix A: ");
        int colsA = sc.nextInt();
        double[][] A = createRandomMatrix(rowsA, colsA);

        System.out.print("Enter rows for matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter columns for matrix B: ");
        int colsB = sc.nextInt();
        double[][] B = createRandomMatrix(rowsB, colsB);

        System.out.println("\nMatrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);

        if(rowsA == rowsB && colsA == colsB) {
            System.out.println("A + B:");
            displayMatrix(addMatrices(A, B));
            System.out.println("A - B:");
            displayMatrix(subtractMatrices(A, B));
        } else {
            System.out.println("Addition/Subtraction not possible due to dimension mismatch");
        }

        if(colsA == rowsB) {
            System.out.println("A * B:");
            displayMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("Multiplication not possible due to dimension mismatch");
        }

        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(A));
        System.out.println("Transpose of B:");
        displayMatrix(transposeMatrix(B));

        if(rowsA == colsA && (rowsA == 2 || rowsA == 3)) {
            if(rowsA == 2) {
                System.out.println("Determinant of A: " + determinant2x2(A));
                System.out.println("Inverse of A:");
                displayMatrix(inverse2x2(A));
            } else {
                System.out.println("Determinant of A: " + determinant3x3(A));
                System.out.println("Inverse of A:");
                displayMatrix(inverse3x3(A));
            }
        } else {
            System.out.println("Determinant/Inverse not possible for Matrix A (not 2x2 or 3x3 square matrix)");
        }

        if(rowsB == colsB && (rowsB == 2 || rowsB == 3)) {
            if(rowsB == 2) {
                System.out.println("Determinant of B: " + determinant2x2(B));
                System.out.println("Inverse of B:");
                displayMatrix(inverse2x2(B));
            } else {
                System.out.println("Determinant of B: " + determinant3x3(B));
                System.out.println("Inverse of B:");
                displayMatrix(inverse3x3(B));
            }
        } else {
            System.out.println("Determinant/Inverse not possible for Matrix B (not 2x2 or 3x3 square matrix)");
        }

        sc.close();
    }
}


