import java.util.Scanner;

public class Q9 {

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                if(i == j) {
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns of a 2D Array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        double[][] matrix = new double[r][c];
        System.out.println("Enter the elements of a 2D Array : ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.println("The elements of the 2D Array are : ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of elements in the major diagonal is : "+sumMajorDiagonal(matrix));

    }

}