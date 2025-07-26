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
        // 4.System.out.println("Sum is "+ result);

        // 5.System.out.println(n + " Factorial is " + Factorial(n));

        /* 6.System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        int result = powerOfNum(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);*/

        
        
        
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

    

    
}

