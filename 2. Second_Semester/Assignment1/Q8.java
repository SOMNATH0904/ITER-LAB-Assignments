import java.util.Scanner;

public class Q8 {

    static void sumMatrix(int[][] matrix) {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("The Sum of elements of the 2D Array is : "+sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of a 2D Array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements of a 2D Array : ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of the 2D Array are : ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sumMatrix(matrix);
    }

}