package company;

import java.util.Scanner;

// Custom exception class extending Exception (checked exception)
class myException extends Exception {
    // Override toString() method — called when printing the object directly
    @Override
    public String toString() {
        return "I am toString() ";
    }

    // Override getMessage() method — called when getting the exception message
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class exceptionClass {
    public static void main(String[] args) {
        int a = 8; // initial value
        System.out.println("Enter any No: ");
        
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); // store user input in 'a'
        
        // Check if the number is less than 9
        if (a < 9) {
            try {
                // Example 1: Throwing a custom exception
                // throw new myException();
                
                // Example 2: Throwing a built-in ArithmeticException with a message
                throw new ArithmeticException("This is an Exception");
            }
            catch (Exception e) {
                // Prints only the message (from getMessage())
                System.out.println(e.getMessage());
                
                // Prints the string representation of the exception (calls toString())
                System.out.println(e);
                
                // Prints the complete stack trace for debugging
                e.printStackTrace();
                
                // This will run after exception handling is complete
                System.out.println("Finished");
            }
        }
    }
}
