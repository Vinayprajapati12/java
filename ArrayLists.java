package AdvancedJava;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {

        // Create l1 with default capacity and l2 with capacity 5
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        // Adding elements to l2
        l2.add(15); // l2 = [15]
        l2.add(18); // l2 = [15, 18]
        l2.add(19); // l2 = [15, 18, 19]

        // Adding elements to l1
        l1.add(6);           // l1 = [6]
        l1.add(7);           // l1 = [6, 7]
        l1.add(4);           // l1 = [6, 7, 4]
        l1.add(6);           // l1 = [6, 7, 4, 6]
        l1.add(0, 5);        // Insert 5 at index 0 → l1 = [5, 6, 7, 4, 6]
        l1.add(0, 1);        // Insert 1 at index 0 → l1 = [1, 5, 6, 7, 4, 6]

        // Checking for values in l1
        System.out.println(l1.contains(0));   // false → 0 is not present in l1
        System.out.println(l1.indexOf(6));    // 2  → first occurrence of 6 is at index 2
        System.out.println(l1.lastIndexOf(6));// 5  → last occurrence of 6 is at index 5

        // Replacing value at index 1
        l1.set(1, 566); // replaces 5 with 566 → l1 = [1, 566, 6, 7, 4, 6]

        // Clearing all elements from l1
        l1.clear(); // l1 = []

        // ❌ Problem: Removing from an empty list will throw IndexOutOfBoundsException
        // l1.remove(0); // This would cause an error → so it’s commented out

        // Adding all elements from l2 into l1
        l1.addAll(l2); // l1 = [15, 18, 19]

        // Printing elements of l1 one by one
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println();

        // Printing a shallow copy of l2
        System.out.println(l2.clone()); // [15, 18, 19]
    }
}
