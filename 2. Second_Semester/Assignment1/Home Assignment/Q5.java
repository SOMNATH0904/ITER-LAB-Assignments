package HomeAssignment;

import java.util.Scanner;

public class Q5 {

    static int largestRow(int[][] arr){
        int maxRow = 0;
        int max1 = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(count > max1){
                max1 = count;
                maxRow = i;
            }
        }
        return maxRow;
    }

    static int largestColumn(int[][] arr){
        int maxColumn = 0;
        int max1 = 0;
        for(int j = 0; j < arr[0].length; j++){
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(count > max1){
                max1 = count;
                maxColumn = j;
            }
        }
        return maxColumn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of a 2D Array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        System.out.println("The Randomly inputs of 0's and 1's in 2D Matrix is : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Largest Row Index is : "+largestRow(matrix));
        System.out.println("The largest Column Index is : "+largestColumn(matrix));
    }
}