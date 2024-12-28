package algorithms.sort.bubble;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};//O(n):O(n)
        sort(arr);//O(n^2):O(1)
        System.out.println(Arrays.toString(arr));//O(n):O(1)
    }

    /**
     * O(n^2) : O(n)*O(n)
     * O(1)
     */
    private static void sort(int[] arr) {
        //O(1):O(1)
        int n = arr.length;
        //O(1) per iteration total O(n):O(1)
        for (int i = 0; i < n - 1; i++) {
            //O(n):O(1)
            for (int j = 0; j < n - 1; j++) {
                //O(1):O(1)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
