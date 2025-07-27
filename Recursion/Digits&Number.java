package recursion;

import java.util.Scanner;

public class digitsAndNumbers {
    public static void main(String[] args) {
        System.out.println("Enter any no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1.int count = countDigits(n);
        //System.out.println("Number of digits: " + count);
    }

    // Count number of digits in a number

    static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }


}

