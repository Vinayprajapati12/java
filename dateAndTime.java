package endOfJava;
import java.util.*;

public class dateAndTime {
    public static void main(String[] args) {
        
        // System.currentTimeMillis():
        // Returns the current time in milliseconds since January 1, 1970 (Unix epoch)
        
        // /1000:
        // Converts milliseconds to seconds
        
        // /3600:
        // Converts seconds to hours (1 hour = 3600 seconds)
        
        // /24:
        // Converts hours to days (1 day = 24 hours)
        
        // /365:
        // Converts days to years (1 year = 365 days, leap years ignored)
        
        // This prints the approximate number of years passed since 1970
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);

         Date d = new Date();          // Creates a Date object with the current date/time
        System.out.println(d);        // Prints the date in default toString() format
    }
}

/*
output
  55 -> in 2025
This means it’s been approximately 55 years since January 1, 1970.

and 

Wed Aug 13 18:40:25 IST 2025

*/
