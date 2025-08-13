package AdvancedJava;
import java.util.*;

public class _93ArrayDeque {
    public static void main(String[] args) {
        
        // Creating an ArrayDeque of Integer type
        // ArrayDeque allows us to add/remove elements from both ends efficiently
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        // Adding elements at the tail (end) of the deque
        ad1.add(6);       // Adds 6 to the end
        ad1.add(56);      // Adds 56 to the end
        ad1.add(9);       // Adds 9 to the end

        // Adding element at the head (front) of the deque
        ad1.addFirst(99); // Adds 99 at the front

        // Adding element at the tail (end) of the deque
        ad1.addLast(1000); // Adds 1000 at the end

        // Retrieving the first (head) element without removing it
        System.out.println(ad1.getFirst()); // Output: 99

        // Retrieving the last (tail) element without removing it
        System.out.println(ad1.getLast()); // Output: 1000
    }
}
