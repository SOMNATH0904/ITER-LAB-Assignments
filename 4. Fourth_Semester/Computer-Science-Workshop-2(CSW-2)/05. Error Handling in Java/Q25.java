import java.util.InputMismatchException;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        int num = readIntegerFromUser();
        System.out.println("The num entered by the user is : "+num);
    }

    public static int readIntegerFromUser() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter an integer : ");
                int number = sc.nextInt();
                return number;
            } catch (InputMismatchException e) {
                System.err.println("InputMismatchException occurred: Invalid input!! Please enter an integer!");
                sc.nextLine();
            }
        }
    }
}

/**
 * OUTPUT
 * Enter an integer :
 * 45
 * The num entered by the user is : 45
 */