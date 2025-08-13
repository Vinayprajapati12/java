package endOfJava;

import java.util.Calendar;          // Import Calendar class (abstract class for date/time operations)
import java.util.GregorianCalendar; // Import GregorianCalendar class (subclass of Calendar)

public class gregorianCalenderClass {
    public static void main(String[] args) {

        // Get the current date and time instance using Calendar's built-in method
        Calendar c = Calendar.getInstance();

        // Print the current date and time in default format
        System.out.println(c.getTime());

        // Print the current day of the month (1–31)
        System.out.println(c.get(Calendar.DATE));

        // Print the current seconds (0–59)
        System.out.println(c.get(Calendar.SECOND));

        // Print the current hour in 12-hour format (0–11)
        System.out.println(c.get(Calendar.HOUR));

        // Print the current time in 24-hour format (HH:MM:SS)
        System.out.println(
            c.get(Calendar.HOUR_OF_DAY) + ":" +  // Hour (0–23)
            c.get(Calendar.MINUTE) + ":" +       // Minutes (0–59)
            c.get(Calendar.SECOND)               // Seconds (0–59)
        );

        // Create a GregorianCalendar object (used for date/time manipulation)
        GregorianCalendar cal = new GregorianCalendar();

        // Check if the year 2020 was a leap year
        System.out.println(cal.isLeapYear(2020));
    }
}
