package algorithms.search.binary;

/**
 * O(log n):O(n)
 */
public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};//O(n):O(n)
        int target = 10;//O(1):O(1)
        int index = recursiveSearch(sortedArray, target, 0, sortedArray.length - 1);//O(log n):O(1)
        System.out.println("Index of target : " + index);//O(1):O(1)
    }

    /**
     * O(log n):O(1)
     */
    private static int recursiveSearch(int[] arr, int target, int l, int r) {//O(1):O(1)
        if (l > r) {
            return -1; // Base Case
        }
        int mid = l + (r - l) / 2;//O(1):O(1)

        if (arr[mid] == target) {//O(1):O(1)
            return mid;//O(1):O(1)
        } else if (arr[mid] < target) {//O(1):O(1)
            return recursiveSearch(arr, target, mid + 1, r);
        } else {//O(1):O(1)
            return recursiveSearch(arr, target, l, mid - 1);
        }
    }

}
