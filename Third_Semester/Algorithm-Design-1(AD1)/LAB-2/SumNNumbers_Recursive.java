import java.util.Scanner;

public class SumNNumbers {
    public static int sum(int n) {
        if(n == 0) return 0;
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Sum of N numbers is : "+sum(n));
    }
}