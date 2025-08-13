package AdvancedJava;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {

        // Create a HashSet of Integers with:
        // Initial capacity = 6 (HashSet will internally create space for 6 buckets)
        // Load factor = 0.5f (When the set is 50% full, it will resize to avoid collisions)
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);

        // Adding elements to the HashSet
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);

        // Adding duplicate element (HashSet will ignore duplicates)
        myHashSet.add(11);

        // Printing the HashSet
        // Note: HashSet does not maintain insertion order
        // and stores elements in an unordered way
        System.out.println(myHashSet);
    }
}

/*

output 
  [3, 6, 8, 11]
*/
