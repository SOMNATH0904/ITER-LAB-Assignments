/**
 * Ques 3 : Write a Java program to multiply two matrices using multithreading. Divide the task of
multiplying rows of the matrices among multiple threads to improve performance.
 */

public class Q03 {
    static int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    static int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
    static int[][] result = new int[matrix1.length][matrix2[0].length];

    public static void main(String[] args) {
        Thread[] threads = new Thread[matrix1.length];

        for(int i = 0; i < matrix1.length; i++) {
            final int row = i;
            threads[i] = new Thread(() -> multiplyRow(row));
            threads[i].start();
        }

        for(Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Matrix Multiplication is : ");
        for(int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    static void multiplyRow(int row) {
        for (int j = 0; j < matrix2[0].length; j++) {
            for (int k = 0; k < matrix1[row].length; k++) {
                result[row][j] += matrix1[row][k] * matrix2[k][j];
            }
        }
    }
}

/**
 * OUTPUT
 *
 * Matrix Multiplication is :
 * 30 24 18
 * 84 69 54
 * 138 114 90
 */