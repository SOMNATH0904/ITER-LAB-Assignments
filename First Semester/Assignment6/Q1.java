package Assignment6;

import java.util.*;

public class Q1 {
    public static int additionSimple(int x, int y) {
        int sum=x+y;
        return sum;
    }
    public static int subtractionSimple(int x, int y) {
        int substraction=x-y;
        return substraction;
    }
    public static int multiplicationSimple(int x, int y) {
        int multiply=x*y;
        return multiply;
    }
    public static double divisionSimple(int x, int y) {
        double division=0;
        if(x!=0) {
            division =(double)y/x;
        }
        return division;
    }
    public static int remainderSimple(int n, int m) {
        int rem =n%m;
        return rem;
    }
    public static double squareRootSimple(int n) {
        double sqroot= Math.sqrt(n);
        return sqroot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        int sum=additionSimple(a,b);
        System.out.println("The sum will be :"+sum);

        int substraction=subtractionSimple(a,b);
        System.out.println("The substraction will be :"+substraction);

        int multiply=multiplicationSimple(a,b);
        System.out.println("The multiplication will be :"+multiply);

        double division=divisionSimple(a,b);
        System.out.println("The division will be :"+division);

        int rem=remainderSimple(a,b);
        System.out.println("The remainder will be :"+rem);

        double sqroot=squareRootSimple(a);
        System.out.println("The Square root will be :"+sqroot);
    }
}