package problems.array.second_largest_element;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestElement_LinearTime_ConstantSpace {
    /**
     * O(n):O(1)
     */
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3};//Constant Time : Constant Space
        //validation
        if(arr.length<2) { //Constant Time : Constant Space
            System.out.println("Array must have atleast two elements");
            return;
        }

        //Time : O(n)
        //Space : O(1)
       int[] result = Arrays.stream(arr)//Linear Time / Linear Space
                .distinct() // Linear Time / Linear Space
                .collect(() -> new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE},// Constant Space
                        (res, num) -> {
                    if(num > res[0]) {
                        res[1] = res[0];
                        res[0] = num;
                    }else if (num > res[1]) {
                        res[1] = num;
                    }
                        },
                        (res1, res2) -> {});
        if(result[1] == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element: " + result[1]);
        }
    }
}
