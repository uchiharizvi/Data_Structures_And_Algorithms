package problems.array.largest_element;

import java.util.Arrays;

public class LargestElementUsingJava8 {
    /**
     * O(n):O(1)
     */
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3};//O(n):O(n)
        int largestElement = Arrays.stream(arr)//Linear Time:Constant Space
                .max()//Linear Time:Constant Space
                .getAsInt();//Constant Time:Constant Space
        System.out.println("Largest Element : " + largestElement);//Constant Time
    }
}
