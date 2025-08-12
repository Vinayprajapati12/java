package company;

// Custom exception class for negative radius
class negativeRadiusException extends Exception {
    // Overrides toString() method to provide a custom message
    @Override
    public String toString() {
        return "Radius can not be Negative";
    }

    // Overrides getMessage() method to provide a custom message
    @Override
    public String getMessage() {
        return "Radius can not be Negative";
    }
}

public class thowAndThrows {

    // Method to calculate the area of a circle
    // Declares that it might throw negativeRadiusException
    public static double area(int r) throws negativeRadiusException {
        if (r < 0) {
            // Throw custom exception if radius is negative
            throw new negativeRadiusException();
        }
        // Area formula: π * r * r
        double result = Math.PI * r * r;
        return result;
    }

    // Method to divide two numbers
    // Declares that it might throw ArrayIndexOutOfBoundsException (unusual here)
    // In reality, division by zero will throw ArithmeticException
    public static int divide(int a, int b) throws ArrayIndexOutOfBoundsException {
        int result = a / b; // Will throw ArithmeticException if b == 0
        return result;
    }

    public static void main(String[] args) {
        try {
            // Example 1: Uncomment to test division by zero
            // int c = divide(6, 0);  // Will throw ArithmeticException

            // Example 2: Calculate area with a positive radius
            double ar = area(5); // No exception will occur here
            System.out.println(ar); // Prints: 78.53981633974483

            // Example 3: Uncomment to test negative radius
            // double arNegative = area(-5); // Will throw negativeRadiusException
            // System.out.println(arNegative);

        } catch (negativeRadiusException e) {
            // Catches our custom negative radius exception
            System.out.println("Custom Exception: " + e.getMessage());

        } catch (ArithmeticException e) {
            // Catches division by zero errors
            System.out.println("Arithmetic Exception: Cannot divide by zero");

        } catch (Exception e) {
            // Catches any other exception types
            System.out.println("General Exception: " + e);
        }
    }
}
