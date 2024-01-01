import java.util.Scanner;

public class Q7 {

    public static int power(int x, int n) {
        if(n == 0) return 1;
        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println("Power will be : "+power(x, n));
    }
}
