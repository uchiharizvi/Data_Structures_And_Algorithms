package problems.array.largest_element;

public class LargestElement {
    /**
     * O(n):O(1)
     */
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3};//O(n):O(n)
        int largestElement = findLargestElement(arr);//O(n):O(1)
        System.out.println("Largest Element : " + largestElement);//O(1)
    }

    /**
     * O(n) Linear Time
     * O(1) Constant Space
     */
    private static int findLargestElement(int[] arr) {
        //O(1):O(1)
        int largestElement = arr[0]; //assume first element is the largest element
        /*
            O(1) per iteration | O(n) Linear Time
            O(1) Constant Space
         */
        for(int i=1;i<arr.length;i++){
            /*
                O(1) Constant Time
             */
            if(arr[i]>largestElement) {
                /*
                    O(1) Constant Time
                 */
                largestElement = arr[i];
            }
        }
        /*
            O(1) Constant Time
         */
        return largestElement;
    }
}
