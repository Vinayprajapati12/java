package recursion;

public class arrayRecursion {
    public static void main(String[] args) {
        /*int[] arr = {10, 20, 30, 40, 50};
        printArray(arr, 0);*/

        /*int[] arr = {5, 10, 15};
        int sum = findSum(arr, 0);
        System.out.println("Sum = " + sum);*/
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
}
