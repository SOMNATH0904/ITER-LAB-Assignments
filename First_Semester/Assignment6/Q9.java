package Assignment6;

import java.util.Scanner;

public class Q9 {

    public static boolean isValidPassword(String password) {
        if(password.length() < 8) {
            return false;
        }
        int digitCount = 0;
        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if(Character.isDigit(ch)) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        scanner.close();
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
