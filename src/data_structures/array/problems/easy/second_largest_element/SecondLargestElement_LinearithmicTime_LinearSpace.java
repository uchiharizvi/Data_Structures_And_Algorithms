package data_structures.array.problems.easy.second_largest_element;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestElement_LinearithmicTime_LinearSpace {
    /**
     * O(n log n):O(n)
     */
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3};//Constant Time : Constant Space
        //validation
        if(arr.length<2) {
            System.out.println("Array must have atleast two elements");
            return;
        }

        //Time : O(n)+O(n)+O(n)+O(n log n)+O(n)+O(n)+O(1) = O(n log n)
        //Space : O(n)+O(n)+O(n)+O(n)+O(1)+O(n)+O(1) = O(n)
        OptionalInt secondLargest = Arrays.stream(arr)//convert array to stream | Linear Time / Linear Space
                .distinct() // remove dups | Linear Time / Linear Space | may create a new stream
                .boxed()//convert int to Integer for sorting | Linear Time / Linear Space
                .sorted((a,b) -> b-a)//sort desc Linearithmic Time / Linear Space
                .skip(1)//Linear Time / Constant Space
                .mapToInt(Integer::intValue) //Linear Time / Linear Space
                .findFirst(); //Constant Time / Constant Space
        if(secondLargest.isPresent()) {
            System.out.println("Second Largest Element: " + secondLargest.getAsInt());
        } else {
            System.out.println("No second largest element found.");
        }
    }
}
