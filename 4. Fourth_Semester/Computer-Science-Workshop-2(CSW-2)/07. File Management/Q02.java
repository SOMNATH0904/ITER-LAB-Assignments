import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        File file = new File("diary.txt");

        if (!file.exists()) {
            System.out.println("The diary file does not exist.");
            return;
        }

        try (Scanner scanner = new Scanner(file)) {
            System.out.println("Contents of diary:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

/**
 * OUTPUT
 * 
 * Contents of diary:
 * 2024-04-17: Hello Lady, Wanna go out with me ?
 * 2024-04-17: Somnath hehehehe :)
 */