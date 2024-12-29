package algorithms.search.binary;

/**
 * O(log n):O(n)
 */
public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};//O(n):O(n)
        int target = 10;//O(1):O(1)
        int index = iterativeSearch(sortedArray, target);//O(log n):O(1)
        System.out.println("Index of target : " + index);//O(1):O(1)
    }

    /**
     * O(log n):O(1)
     */
    private static int iterativeSearch(int[] arr, int target) {//O(1):O(1)
        int l = 0, r = arr.length - 1;//O(1):O(1)
        while (l <= r) {//O(log n):O(1)
            int mid = l + (r - l) / 2;//O(1):O(1)
            if(arr[mid] == target) {//O(1):O(1)
                return mid;//O(1):O(1)
            } else if (arr[mid]<target) {//O(1):O(1)
                l = mid + 1;//O(1):O(1)
            } else {//O(1):O(1)
                r = mid - 1;//O(1):O(1)
            }
        }

        return -1;//O(1):O(1)
    }
}
