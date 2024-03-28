import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String input = scanner.nextLine();
        int result = convertStringToInteger(input);
        System.out.println("Converted integer : "+result);
        scanner.close();
    }

    public static int convertStringToInteger(String input) {
        Scanner sc = new Scanner(System.in);
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException occurred : Invalid input!! Please enter a valid integer!");
            System.out.println("Enter a number: ");
            String newInput = sc.nextLine();
            return convertStringToInteger(newInput);
        } finally {
            sc.close();
        }
    }
}

/**
 * OUTPUT
 * Enter a number :
 * 56
 * Converted integer : 56
 */