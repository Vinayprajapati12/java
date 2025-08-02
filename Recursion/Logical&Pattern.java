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


        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        printTriangle(n, 0);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Binary of " + num + " is: ");
        printBinary(num);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int steps = countSteps(n);
        System.out.println("Steps to reduce " + n + " to 0: " + steps);*/
    }


    // 1. Calculate x^n using recursion (power function)

    static int power(int x, int n) {
        if (n == 0) {
            return 1; // base case: x^0 = 1
        }
        return x * power(x, n - 1); // recursive step
    }

    // 2. Print triangle pattern using recursion

    static void printTriangle(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            printTriangle(row, col + 1);
            System.out.print("* ");
        } else {
            printTriangle(row - 1, 0);
            System.out.println();
        }
    }

    // 3. Print binary representation of a number

    static void printBinary(int n) {
        if (n == 0) {
            return;
        }
        printBinary(n / 2);          // recursive call
        System.out.print(n % 2);     // print remainder
    }

     // 4. Count steps to reduce number to 0 (n - 1 each time)

    static int countSteps(int n) {
        if (n == 0) {
            return 0; // base case
        }
        return 1 + countSteps(n - 1); // each step subtracts 1
    }
}
