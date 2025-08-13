package endOfJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormatter {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime dt = LocalDateTime.now();

        // Print the current date and time in default ISO format
        System.out.println(dt);

        // Create a custom format with date and time
        // dd   -> Day of month (2 digits)
        // MM   -> Month (2 digits)
        // yyyy -> Calendar year
        // HH   -> Hour in 24-hour format (00-23)
        // mm   -> Minutes (00-59)
        // ss   -> Seconds (00-59)
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the LocalDateTime into our custom pattern
        String myDateTime = dt.format(df);

        // Print the formatted date and time
        System.out.println(myDateTime);
    }
}
