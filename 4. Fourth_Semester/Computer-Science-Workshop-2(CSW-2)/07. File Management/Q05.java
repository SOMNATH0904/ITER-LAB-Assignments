import java.io.File;
import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        File[] txtFiles = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
        if (txtFiles != null && txtFiles.length > 0) {
            System.out.println("Text files in " + directory.getAbsolutePath() + ":");
            for (File txtFile : txtFiles) {
                System.out.println(txtFile.getName());
            }
        } else {
            System.out.println("No text files found in the directory.");
        }
    }
}

/**
 * OUTPUT
 *
 * Enter the directory path:
 * C:\Users\Somnath\OneDrive\Desktop\CSES-Problems
 * No text files found in the directory.
 */