package recursion;

public class arrayRecursion {
    public static void main(String[] args) {
        /*int[] arr = {10, 20, 30, 40, 50};
        printArray(arr, 0);*/

        /*int[] arr = {5, 10, 15};
        int sum = findSum(arr, 0);
        System.out.println("Sum = " + sum);*/

        /*int[] arr = {2, 3, 6, 9, 11};
        boolean isSorted = isSorted(arr, 0);
        System.out.println("Array is sorted: " + isSorted);*/

        /*int[] arr = {4, 8, 15, 23, 42};
        int target = 15;
        int index = linearSearch(arr, 0, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }*/


        /*int[] arr = {3, 5, 7, 5, 9};
        int target = 5;
        int index = findFirstIndex(arr, 0, target);

        if (index != -1) {
            System.out.println("First occurrence at index: " + index);
        } else {
            System.out.println("Element not found.");
        }*/
        
    }


    // 1. Print elements of an array
    
    static void printArray(int[] arr, int index) {
        // Base condition
        if (index == arr.length) {
            return;
        }

        // Print current element
        System.out.println(arr[index]);

        // Recursive call for next index
        printArray(arr, index + 1);
    }

    // 2. Find sum of all elements in an array

    static int findSum(int[] arr, int index) {
        // Base case
        if (index == arr.length) {
            return 0;
        }
        // Recursive case
        return arr[index] + findSum(arr, index + 1);
    }

    // 3. Check if array is sorted (ascending)

    static boolean isSorted(int[] arr, int index) {
        // Base case: if we reach second last element
        if (index == arr.length - 1) {
            return true;
        }

        // If current element is greater than next, not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Check rest of the array
        return isSorted(arr, index + 1);
    }

    // 4. Linear search recursively

    static int linearSearch(int[] arr, int index, int target) {
        // Base case: not found
        if (index == arr.length) {
            return -1;
        }

        // If found
        if (arr[index] == target) {
            return index;
        }

        // Recursive call
        return linearSearch(arr, index + 1, target);
    }

    // 5. Find first index of a target element

    static int findFirstIndex(int[] arr, int index, int target) {
        // Base case: reached end, not found
        if (index == arr.length) {
            return -1;
        }

        // Match found
        if (arr[index] == target) {
            return index;
        }

        // Check next
        return findFirstIndex(arr, index + 1, target);
    }
}
