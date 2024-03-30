import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            String input = sc.nextLine();
            try {
                int num = Integer.parseInt(input);
                try {
                    int result = 10 / num;
                    System.out.println("Result of division : "+result);
                } catch (ArithmeticException e) {
                    System.err.println("ArithmeticException Occurred : "+e.getMessage());
                }
            } catch(NumberFormatException e) {
                System.err.println("NumberFormatException occurred: Invalid input!! Please enter a valid integer!");
            }
        } catch(Exception e) {
            System.err.println("An error occurred : "+e.getMessage());
        } finally {
            sc.close();
        }
    }
}

/**
 * OUTPUT
 * Enter a number:
 * 45
 * Result of division : 0
 */