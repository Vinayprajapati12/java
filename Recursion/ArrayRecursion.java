package recursion;

public class arrayRecursion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        printArray(arr, 0);
    }


    // Print elements of an array
    
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
}
