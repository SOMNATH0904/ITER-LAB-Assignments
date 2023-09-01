package HomeAssignment;

import java.util.Scanner;

public class Q4 {

    public static double[][] addMatrix(double[][] a, double[][] b){
//        if(a.length != b.length){
//            System.out.println("Addition Not Possible");
//        }
        double[][] add = new double[a.length][a[0].length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                add[i][j] = a[i][j] + b[i][j];
            }
        }
        return add;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of a Matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        double[][] matrix1 = new double[r][c];
        System.out.println("Enter the elements of Matrix 1 : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix1[i][j] = sc.nextDouble();
            }
        }

        double[][] matrix2 = new double[r][c];
        System.out.println("Enter the elements of Matrix 2 : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix2[i][j] = sc.nextDouble();
            }
        }

        System.out.println("The Addition of Matrix 1 and Matrix 2 is : ");
        double[][] add = addMatrix(matrix1, matrix2);
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
}