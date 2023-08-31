import java.util.Scanner;

public class Q6 {

    public static boolean isOdd(int n) {
        int a = n & 1;
        if(a == 0)
            return false;
        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(n+" is a Odd Number : "+isOdd(n));

    }

}