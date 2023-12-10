package Assignment6;

import java.util.*;

public class Q2 {
    public static int getPentagonalNumber(int n) {
        int pgonal=n*(3*n-1)/2;
        return pgonal;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int count =1;
        System.out.println("The Pentagonal Numbers are as follows --> ");
        for(int i=1;i<=n;i++) {
            System.out.print(getPentagonalNumber(i)+" ");
            if(count%10==0) {
                System.out.println();
            }
            count++;
        }
    }
}