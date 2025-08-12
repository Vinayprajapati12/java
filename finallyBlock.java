package company;

public class finallyBlock {

    // Method to demonstrate try-catch-finally behavior
    public static int greet() {
        try {
            int a = 50;
            int b = 0; // This will cause division by zero
            int c = a / b; // Exception occurs here -> ArithmeticException
            return c; // This line is skipped if exception happens
        } 
        catch (Exception e) {
            // Handles any exception
            System.out.println(e); // Prints the exception message
        } 
        finally {
            // This block runs no matter what happens in try/catch
            System.out.println("This is the end of this function");
        }
        // Returned if exception occurs and try's return is skipped
        return 0;
    }

    public static void main(String[] args) {
        
        // Call greet() and print returned value
        int k = greet();
        System.out.println(k); // Will print 0 because of division by zero in greet()

        int a = 7;
        int b = 9;

        // Infinite loop to demonstrate finally execution in a loop
        while (true) {
            try {
                // Integer division (will give 0 until b < a)
                System.out.println(a / b);
            } 
            catch (Exception e) {
                // Handles any runtime exception (like division by zero)
                System.out.println(e);
                break; // Exit the loop if exception occurs
            } 
            finally {
                // Always executes after try/catch, even if exception happens
                System.out.println("I am finally for value of b = " + b);
            }
            b--; // Decrease b to eventually cause division by zero
        }
    }
}
