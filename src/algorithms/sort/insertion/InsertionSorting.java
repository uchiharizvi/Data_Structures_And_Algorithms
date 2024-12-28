package algorithms.sort.insertion;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for(int i = 1;i<arr.length;i++){
            if(arr[i-1]>arr[i]) {
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
