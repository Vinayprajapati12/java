package question;

import java.util.Scanner;

public class oddEvenRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        oddEven(n); // ✅ Just call it
    }

    static void oddEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even No");
        } else {
            System.out.println("Odd No");
        }
    }
}

