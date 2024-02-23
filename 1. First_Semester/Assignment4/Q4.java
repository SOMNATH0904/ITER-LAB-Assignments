package Assignment4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int y = sc.nextInt();
        int p, q, r;
        if(x > y) {
            p = x;
            q = y;
        } else {
            p = y;
            q = x;
        }
        while(p%q != 0) {
            r = p%q;
            p = q;
            q = r;
        }
        System.out.println("GCD of "+x+" and "+y+ " is : "+q);
    }
}
