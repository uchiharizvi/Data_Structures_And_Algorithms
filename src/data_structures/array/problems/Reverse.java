package data_structures.array.problems;


import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        System.out.println("Original Array");
        printArray(input);
        reverse(input);
        System.out.println("Reversed Array");
        printArray(input);
    }


    /**
     * Two Pointer Approach
     * Use two pointers, one starting from the beginning (left) and one from the end (right).
     * Swap the elements at these two pointers.
     * Move left forward and right backward until they meet in the middle.
     * Time Complexity: O(n)
     * Space Complexity: O(1) (in-place)
     */
    private static void reverse(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            //swap the elements at two pointers
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            //Move Pointers
            left++;
            right--;
        }
    }

    public static void printArray(int[] numbers) {
        for(int number:numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
