package Assignment5;

import java.util.Scanner;

public class HAQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        int k = 0;
        for(int i = 1; i <= n; i++) {
            k++;
            for(int j = 1; j >= 1; j--) {
                if(j == k) {
                    System.out.print("*"+" ");
                } else {
                    System.out.println(j+" ");
                }
            }
            System.out.println();
        }
    }
}
