package recursion;

import java.util.Scanner;

public class stringRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.nextLine();

        // 1. printChars(str, 0);
        
        // 2. reversePrint(str, 0);

        /* 3. if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }*/

        /* 4. int count = countVowels(str, 0);
        System.out.println("Number of vowels: " + count); */
        
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


    //  Check if a string is palindrome

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true; // middle reached
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; // mismatch found
        }
        return isPalindrome(str, start + 1, end - 1); // check inward
    }

    // Count vowels in a string
    
    static int countVowels(String str, int index) {
        if (index == str.length()) {
            return 0;
        }

        char ch = Character.toLowerCase(str.charAt(index));

        int count = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0;

        return count + countVowels(str, index + 1);
    }
}

