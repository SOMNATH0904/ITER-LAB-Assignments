import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent_file.txt");
            Scanner sc = new Scanner(file);
            System.out.println("File found : "+file.getName());
        } catch(FileNotFoundException e) {
            System.err.println("FileNotFoundException occurred : "+e.getMessage());
        }
    }
}

/**
 * OUTPUT
 * FileNotFoundException occurred : nonexistent_file.txt (The system cannot find the file specified)
 */