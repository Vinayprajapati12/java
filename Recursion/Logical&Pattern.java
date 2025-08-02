package recursion;

import java.util.Scanner;

public class logicalAndPattern {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        int result = power(x, n);
        System.out.println(x + "^" + n + " = " + result);*/
    }


    // 1. Calculate x^n using recursion (power function)

    static int power(int x, int n) {
        if (n == 0) {
            return 1; // base case: x^0 = 1
        }
        return x * power(x, n - 1); // recursive step
    }
}
