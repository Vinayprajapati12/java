package company;

import java.util.Scanner;

public class errors {
    public static void main(String[] args) {

        // Syntax Error
        int a = 0 // Error: No Semicolon !
        b=5; // Error : b not declared !


        // Logical Error demo
        // prime no. 1 t 10
        System.out.println(2);
        for (int i = 1; i <5 ; i++) {
            System.out.println(2*i+1);
        }
        // 9 also was printed ->Non Prime

        // Runtime Error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
        // if input k=0
    }
}
