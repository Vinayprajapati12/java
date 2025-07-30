package recursion;

import java.util.Scanner;

public class stringRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.nextLine();

        // 1. printChars(str, 0);
        
    }


    // Print each character of a string 
    
    static void printChars(String str, int index) {
        if (index == str.length()) {
            return;
        }
        System.out.println(str.charAt(index));
        printChars(str, index + 1);
    }
}

