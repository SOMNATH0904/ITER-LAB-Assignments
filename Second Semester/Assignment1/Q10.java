import java.util.Scanner;

public class Q10 {

    public static double sumColumn(double[][] m, int columnIndex) {
        double sumColumn = 0;
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length;j++) {
                if(j == columnIndex) {
                    sumColumn += m[i][j];
                }
            }
        }
        return sumColumn;
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
        for(int k = 0; k < c; k++) {
            System.out.println("Sum of elements at column "+k+" is : "+sumColumn(matrix, k));
        }

    }

}