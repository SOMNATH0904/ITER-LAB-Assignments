/**
 * Ques 11 : Write a Java program that converts a given date and time in UTC to the local date and time of a specific time zone (e.g., "America/New_York"). Parse a string representing a date and time in UTC format. Convert the parsed Instant to a ZonedDateTime using a specific ZoneId.
 */

/**
 * CODE
 */

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Q11 {
    public static void main(String[] args) {
        Instant instant = Instant.parse("2024-05-14T10:15:30Z");

        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);

        System.out.println("Local Date and Time in New York: " + zonedDateTime);
    }
}

/**
 * OUTPUT
 * 
 * Local Date and Time in New York: 2024-05-14T06:15:30-04:00[America/New_York]
 */