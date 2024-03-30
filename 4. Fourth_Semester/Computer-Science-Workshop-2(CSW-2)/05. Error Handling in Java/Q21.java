import java.util.Scanner;

public class Q21 {
    public static void inputMatrixElements(int[][] matrix, Scanner sc) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at position ["+i+"]["+j+"]:");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return res;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] res = new int[rows1][cols2];
        for(int i = 0; i < rows1; i++) {
            for(int j = 0; j < cols2; j++) {
                for(int k = 0; k < cols1; k++) {
                    res[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return res;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the matrices : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns for the matrices : ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        System.out.println("Enter elements of first matrix:");
        inputMatrixElements(matrix1, sc);
        System.out.println("Enter elements of second matrix:");
        inputMatrixElements(matrix2, sc);

        try {
            System.out.println("Matrix Addition --> ");
            int[][] additionResult = addMatrices(matrix1, matrix2);
            printMatrix(additionResult);

            System.out.println("Matrix Multiplication --> ");
            int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
            printMatrix(multiplicationResult);

            System.out.println("Transpose of First Matrix --> ");
            int[][] transposeResult = transposeMatrix(matrix1);
            printMatrix(transposeResult);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
        sc.close();
    }
}

/**
 * OUTPUT
 *
 * Enter the number of rows for the matrices :
 * 3
 * Enter the number of columns for the matrices :
 * 2
 * Enter elements of first matrix:
 * Enter element at position [0][0]:
 * 2 1
 * Enter element at position [0][1]:
 * Enter element at position [1][0]:
 * 3 4
 * Enter element at position [1][1]:
 * Enter element at position [2][0]:
 * 5 3
 * Enter element at position [2][1]:
 * Enter elements of second matrix:
 * Enter element at position [0][0]:
 * 3 6
 * Enter element at position [0][1]:
 * Enter element at position [1][0]:
 * 2 4
 * Enter element at position [1][1]:
 * Enter element at position [2][0]:
 * 5 3
 * Enter element at position [2][1]:
 * Matrix Addition -->
 * 5	7
 * 5	8
 * 10	6
 *
 * Matrix Multiplication -->
 * 8	16
 * 17	34
 * 21	42
 *
 * Transpose of First Matrix -->
 * 2	3	5
 * 1	4	3
 */