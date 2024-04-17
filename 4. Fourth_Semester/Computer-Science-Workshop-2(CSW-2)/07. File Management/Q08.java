import java.io.File;
import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current file name:");
        String currentFileName = scanner.nextLine();

        System.out.println("Enter the new file name:");
        String newFileName = scanner.nextLine();

        File currentFile = new File(currentFileName);
        File newFile = new File(newFileName);

        if (!currentFile.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        if (newFile.exists()) {
            System.out.println("A file with the new name already exists. Renaming canceled.");
            return;
        }

        boolean renamed = currentFile.renameTo(newFile);
        if (renamed) {
            System.out.println("File successfully renamed to " + newFileName);
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}

/**
 * OUTPUT
 *
 * Enter the current file name:
 * C:\Users\Somnath\OneDrive\Desktop\Delta-main
 * Enter the new file name:
 * C:\Users\Somnath\OneDrive\Desktop\JS
 * A file with the new name already exists. Renaming canceled.
 */