package Assignment5;

import java.util.Scanner;

public class Q7C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = n; j > i; j--) {
                System.out.println(" ");
                for(int k = 1; k <= i; k--) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
