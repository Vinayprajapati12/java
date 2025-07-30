package recursion;

import java.util.Scanner;

public class stringRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.nextLine();

        // 1. printChars(str, 0);
        
        // 2. reversePrint(str, 0);
    }


    // Print each character of a string 
    
    static void printChars(String str, int index) {
        if (index == str.length()) {
            return;
        }
        System.out.println(str.charAt(index));
        printChars(str, index + 1);
    }


     // Reverse a string

    static void reversePrint(String str, int i) {
        if (i == str.length()) {
            return;
        }

        reversePrint(str, i + 1); // go to the end first
        System.out.println(str.charAt(i)); // print on returning
    }
}

