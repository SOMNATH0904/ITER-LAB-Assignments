import java.io.File;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file to delete:");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File '" + fileName + "' does not exist.");
            return;
        }

        boolean deleted = file.delete();
        if (deleted) {
            System.out.println("File '" + fileName + "' has been successfully deleted.");
        } else {
            System.out.println("Failed to delete file '" + fileName + "'.");
        }
    }
}

/**
 * OUTPUT
 *
 * Enter the name of the file to delete:
 * GITHUB
 * File 'GITHUB' does not exist.
 */