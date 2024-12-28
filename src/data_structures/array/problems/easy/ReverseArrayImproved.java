package data_structures.array.problems.easy;
// None:None (compile-time directive and does not impact runtime/does not consume memory at runtime.)

import java.util.Arrays;

/**
 * Time Complexity: Space Complexity Analysis format (TC:SC)
 * Total Time : O(n) Linear Time - O(1)+O(n)+O(n)+O(n) = O(n)
 * Total Space : O(n) Linear Space - O(n)
 */
public class ReverseArrayImproved {
    public static void main(String[] args) { //Entry Point - No direct complexity associated
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println("Reverse Array : " + Arrays.toString(arr));
    }

    /**
     * The Loop executes n/2 times
     * Total Time : O(n) Linear Time - O(1)+O(n) = O(n)
     * Total Space : O(1) Constant Space
     */
    private static void reverse(int[] arr) {
        int l = 0; //O(1):O(1) Constant Space
        int r = arr.length - 1; //O(1):O(1) Constant Time : Constant Space
        /*
            runs for n/2 only and not n
            O(n/2)*O(1) = O(n)
         */
        while (l > r) {
            int temp = arr[l]; // O(1):O(1)
            arr[l] = arr[r]; // O(1)
            arr[r] = temp; // O(1)
            //Total Swap = O(1)+O(1)+O(1) - O(1)
            l++;//O(1)
            r--;//O(1)
        }
    }
}
