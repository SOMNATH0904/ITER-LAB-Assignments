import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q23 {
    public static void main(String[] args) {
        try {
            String filePath = "input.txt";
            processDataFromFile(filePath);
        } catch(IOException e) {
            System.err.println("IOException occurred : "+e.getMessage());
        }
    }

    public static void processDataFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Processing line : "+line);
            }
        }
    }
}

/**
 * OUTPUT
 * IOException occurred : input.txt (The system cannot find the file specified)
 */