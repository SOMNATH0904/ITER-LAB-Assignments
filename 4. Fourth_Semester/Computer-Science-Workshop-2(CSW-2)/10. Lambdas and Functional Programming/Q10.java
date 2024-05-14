/**
 * Ques 10 : Write a Java program that takes a LocalDateTime object and formats it to a custom string format ("yyyy MM dd HH:mm:ss"). Define a LocalDateTime object representing a specific date and time. Use DateTimeFormatter to format the LocalDateTime object to the desired string format.
 */

/**
 * CODE
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q10 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        // Formatting LocalDateTime to custom string format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);

        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}

/**
 * OUTPUT
 * Formatted DateTime: 2024-05-14 16:28:38
 */