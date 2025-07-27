package recursion;

import java.util.Scanner;

public class RecQue {
    public static void main(String[] args) {
        System.out.println("Enter any no: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        // 1.OneToN(n);
        
        // 2.NtoOne(n);
        
        // 3.int result = SumOf1toN(n);
        // System.out.println("Sum is "+ result);

        // 4.System.out.println(n + " Factorial is " + Factorial(n));

        /* 5.System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        int result = powerOfNum(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);*/

        /* 6.if (isEven(n)) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        } */


        // 7. Even Numbers
       // printEven(1, n);
        
        // 8. Odd Numbers
       // printOdd(1,n);
        
    }

    // 1 to N numbers

    static void OneToN(int n){
        if(n==0)
            return;
        OneToN(n-1);
        System.out.println(n);
    }

    //n to 1 numbers

    static void NtoOne(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        NtoOne(n-1);
    }

        // Sum of 1 to N

    static int SumOf1toN(int n){
        if(n==0){
            return 0;
        }
        return n + SumOf1toN(n-1);
    }

    // Factorial of a number

    static int Factorial(int n){
        if(n==1) return 1;
        return n * Factorial(n-1);
    }

    // Power of a number

    static int powerOfNum(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * powerOfNum(base, exponent - 1);
    }

    // Odd Even

    static boolean isEven(int n) {
        if (n == 0) return true;     // base case for even
        if (n == 1) return false;    // base case for odd
        return isEven(n - 2);        // subtract 2 and check again
    }

    // Even Numbers

    static void printEven(int i, int n) {
        if (i > n) return;
        if (i % 2 == 0) System.out.println(i);
        printEven(i + 1, n);
    }


    // Print Odd numbers From 1 to N

    static void printOdd(int i, int n) {
        if (i > n) return;
        if (i % 2 != 0) System.out.println(i);
        printOdd(i + 1, n);
    }
    
}

