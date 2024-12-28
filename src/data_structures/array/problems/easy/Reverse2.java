package data_structures.array.problems.easy;
// None:None (compile-time directive and does not impact runtime/does not consume memory at runtime.)
import java.util.Arrays;

/**
 * Time Complexity: Space Complexity Analysis format (TC:SC)
 * Total Time : O(n) Linear Time - O(1)+O(n)+O(n)+O(n) = O(n)
 * Total Space : O(n) Linear Space - O(n)
 */
public class Reverse2 {
    public static void main(String[] args) { //Entry Point - No direct complexity associated
        /*
            O(1):O(n)
            Initializing an array takes constant time
            Space for an array of size n is allocated
         */
        int[] arr = {1, 2, 3, 4, 5};
        /*
            O(n)
            Check below function
         */
        int[] reverseArr = reverse(arr);
        /*
          O(n):O(n)
          The Arrays.toString() method iterates through the array to build a string representation
          The string representation of the array requires additional space proportional to the array’s size.
          */
        //todo improve
        System.out.println("Original Array : " + Arrays.toString(arr));
        /*
          O(n):O(n)
          The Arrays.toString() method iterates through the array to build a string representation
          The string representation of the array requires additional space proportional to the array’s size.
          */
        //todo improve
        System.out.println("Reverse Array : " + Arrays.toString(reverseArr));
    }

    /**
     * Total Time : O(n) Linear Time - O(1)+O(1)+O(n)+O(1) = O(n)
     * Total Space : O(n) Linear Space - O(n) The dominant is O(n)
     */
    private static int[] reverse(int[] arr) {
        /*
            O(1):O(n)
            Allocating an array does not depend on its size in terms of time
            Memory for an array of size n is allocated
         */
        int[] reverseArr = new int[arr.length];//takes space
        /*
            O(1):O(1)
            Variable initialization takes constant time
            Memory for a single integer variable is allocated
         */
        int revCounter = 0;
        /*
            O(n):O(1)
            The loop runs n times, where n is the length of the array
            No extra space is required for the loop itself
         */
        //todo dominant operation O(n)
        for (int i = arr.length - 1; i >= 0; i--) {
            /*
                O(1) per iteration | Total O(n):none
                Accessing and assigning array elements are constant-time operations.
                Over n iterations, this contributes O(n)
                This operation modifies the existing reverseArr, so no additional space is used
         */
            reverseArr[revCounter] = arr[i];
            /*
                O(1) per iteration | Total O(n):none
                Incrementing a variable is a constant-time operation.
                Over n iterations, this contributes O(n)
                Uses the already allocated revCounter variable
         */
            revCounter++;
        }
        /*
            O(1):none
            Returning a reference to an array is constant time
            Returning a reference to an array is constant time
         */
        return reverseArr;
    }
}
