import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q04 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java FileContentReader <file_path>");
            return;
        }
        String filePath = args[0];
        try {
            readAndPrintFileContent(filePath);
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException occurred: " + e.getMessage());
        } catch (FileReadPermissionException e) {
            System.err.println("FileReadPermissionException occurred: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
    }

    public static void readAndPrintFileContent(String filePath) throws IOException {
        if (filePath == null) {
            throw new FileNotFoundException("File path is null.");
        }
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File does not exist: " + filePath);
        }
        if (!file.canRead()) {
            throw new FileReadPermissionException("Permission denied. Cannot read file: " + filePath);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

class FileNotFoundException extends IOException {
    public FileNotFoundException(String message) {
        super(message);
    }
}

class FileReadPermissionException extends IOException {
    public FileReadPermissionException(String message) {
        super(message);
    }
}

/**
 * OUTPUT
 * Usage: java FileContentReader <file_path>
 */