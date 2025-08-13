package endOfJava; // Defines the package name for organizing classes

// Importing classes from java.time package to work with date and time
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class javaTime {
    public static void main(String[] args) {
        
        // Get the current date (year, month, day) from the system clock
        LocalDate d = LocalDate.now();
        System.out.println(d); // Prints the current date in YYYY-MM-DD format

        // Get the current time (hour, minute, second, nanosecond) from the system clock
        LocalTime t = LocalTime.now();
        System.out.println(t); // Prints the current time in HH:MM:SS.nnnnnnnnn format

        // Get the current date and time together
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt); // Prints the current date and time in YYYY-MM-DDTHH:MM:SS.nnnnnnnnn format
    }
}
