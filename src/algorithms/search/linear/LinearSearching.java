package algorithms.search.linear;


public class LinearSearching {
    /**
     * O(n):O(1)
     */
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 7};//O(n):O(n)
        int target = 8;//O(1):O(1)
        int index = search(arr, target);//O(n):O(1)
        System.out.println("Index of target: " + index);//O(1):O(1)
    }

    /**
     * O(n):O(1)
     */
    private static int search(int[] arr, int target) {//O(1):O(1)
        //O(n):O(1)
        for (int i = 0; i < arr.length; i++) {
            //O(1):O(1)
            if (arr[i] == target) {
                //O(1):O(1)
                return i;
            }
        }
        //O(1):O(1)
        return -1;
    }
}
