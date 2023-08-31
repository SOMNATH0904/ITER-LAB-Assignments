import java.util.Scanner;

public class Q7 {

    public static int fact(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return n * fact(n-1);
    }

    public static int power(int a, int b) {
        if(b == 0) return 1;
        if(b == 1) return a;
        return a * power(a,b-1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return a + gcd(b, a % b);
    }

    public static String decimalToBinary(int n) {
        if(n == 0)  return "0";
        else if(n == 1) return "1";
        return decimalToBinary(n/2) + String.valueOf(n%2);
    }

    public static int product(int a, int b) {
        if(b != 0)  return (a + product(a,b-1));
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Choose a Mathematical Operation from below ->");
            System.out.println("1. Determine the Factorial of a Number");
            System.out.println("2. Determine X^N for two Numbers X,N");
            System.out.println("3. Determine GCD of two Numbers");
            System.out.println("4. Binary Equivalent of a Decimal Number");
            System.out.println("5. Product of two Numbers : ");
            System.out.println("Enter the Choice : ");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Enter a Number : ");
                    int n = sc.nextInt();
                    System.out.println("Factorial of "+n+" is : "+fact(n));
                    break;
                case 2:
                    System.out.println("Enter value of a : ");
                    int X = sc.nextInt();
                    System.out.println("Enter value of b : ");
                    int N = sc.nextInt();
                    System.out.println("Power "+X+"^"+N+" is : "+power(X,N));
                    break;
                case 3:
                    System.out.println("Enter 1st Number : ");
                    int n1 = sc.nextInt();
                    System.out.println("Enter 2nd Number : ");
                    int n2 = sc.nextInt();
                    System.out.println("GCD of "+n1+" and "+n2+" is : "+gcd(n1,n2));

                case 4:
                    System.out.println("Enter a Decimal Number : ");
                    int decimal = sc.nextInt();
                    String binary = decimalToBinary(decimal);
                    System.out.println(decimal+" in Binary is : "+binary);
                    break;
                case 5:
                    System.out.println("Enter 1st Number : ");
                    int A = sc.nextInt();
                    System.out.println("Enter 2nd Number : ");
                    int S = sc.nextInt();
                    System.out.println("Product of "+A+" and "+S+" is : "+product(A,S));
                    break;
                default:
                    System.out.println("Wrong Choice !");
            }
        }
    }
}