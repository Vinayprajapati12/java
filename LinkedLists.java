package AdvancedJava;
import java.util.*;
import java.util.LinkedList;

public class linkedLists {
    public static void main(String[] args) {

        // Create two LinkedLists of Integers
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        // Add elements to l2
        l2.add(15); // l2 = [15]
        l2.add(18); // l2 = [15, 18]
        l2.add(19); // l2 = [15, 18, 19]

        // Add elements to l1
        l1.add(6);       // l1 = [6]
        l1.add(7);       // l1 = [6, 7]
        l1.add(4);       // l1 = [6, 7, 4]
        l1.add(6);       // l1 = [6, 7, 4, 6]
        l1.add(0, 5);    // Insert 5 at index 0 → l1 = [5, 6, 7, 4, 6]
        l1.add(0, 1);    // Insert 1 at index 0 → l1 = [1, 5, 6, 7, 4, 6]

        // LinkedList-specific methods
        l1.addFirst(999); // Add at the start → l1 = [999, 1, 5, 6, 7, 4, 6]
        l1.addLast(0);    // Add at the end → l1 = [999, 1, 5, 6, 7, 4, 6, 0]

        // Searching in l1
        System.out.println(l1.contains(0));    // true → 0 is at last position
        System.out.println(l1.indexOf(6));     // 3 → first occurrence of 6
        System.out.println(l1.lastIndexOf(6)); // 6 → last occurrence of 6

        // Replacing element at index 1
        l1.set(1, 566); // l1 = [999, 566, 5, 6, 7, 4, 6, 0]

        // If uncommented, this would clear all elements:
        // l1.clear();

        // If uncommented, this would remove the first element:
        // l1.remove(0);

        // Adding all elements from l2 into l1
        l1.addAll(l2); // l1 = [999, 566, 5, 6, 7, 4, 6, 0, 15, 18, 19]

        // Printing elements of l1
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)); // get() fetches element by index
            System.out.print(", ");
        }
        System.out.println();

        // Cloning l2 → returns a shallow copy
        System.out.println(l2.clone()); // Output: [15, 18, 19]
    }
}
