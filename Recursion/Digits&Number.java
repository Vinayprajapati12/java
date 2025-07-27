package recursion;

import java.util.Scanner;

public class digitsAndNumbers {

    // static int reverse = 0; -> Reverse Number
    
    public static void main(String[] args) {
        System.out.println("Enter any no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1.int count = countDigits(n);
        //System.out.println("Number of digits: " + count);

        // 2.int sum = sumOfDigits(n);
        //System.out.println("Sum of digits: " + sum);

        // 3.int product = productOfDigits(n);
        // System.out.println("Product of digits: " + product);

        // 4. reverseNumber(n);
        // System.out.println("Reversed number: " + reverse);

        /* 5. int reversed = reverse(n, 0);

        if (n == reversed) {
            System.out.println(n + " is a Palindrome");
        } else {
            System.out.println(n + " is NOT a Palindrome");
        }*/
        
    }

    // Count number of digits in a number

    static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }


    // Sum of digits of a number

    static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    // Product of digits

    static int productOfDigits(int n) {
        if (n == 0) return 0;       // Edge case: if the number is 0, return 0
        if (n < 10) return n;       // Base case: single digit
        return (n % 10) * productOfDigits(n / 10);
    }

    // Reverse a number

    static void reverseNumber(int n) {
        if (n == 0) return;
        reverse = reverse * 10 + n % 10;
        reverseNumber(n / 10);
    }

    // Check if a number is palindrome

    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        return reverse(n / 10, rev);
    }
}

