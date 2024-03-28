import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        try {
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            System.out.println("Entered num : "+num);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException occurred : Invalid input !! Please enter a valid integer!");
        } finally {
            scanner.close();
        }
    }
}

/**
 * OUTPUT
 * Enter a number : A
 * NumberFormatException occurred : Invalid input !! Please enter a valid integer!
 */