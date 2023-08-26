package Assignment4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a no. for which you want to find the multiplication table : ");
        int n = sc.nextInt();
        int result = 1;
        System.out.println("The multiplication table of "+n+" is : ");
        for(int i = 1; i <= 10; i++) {
            result = n*i;
            System.out.println(n+" * "+i+" is : "+result);
        }
    }
}