package Assignment5;

import java.util.Scanner;

public class Q7A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 65; j < 65+i; j++) {
                System.out.print((char) j +" ");
            }
            System.out.println();
        }
    }
}
