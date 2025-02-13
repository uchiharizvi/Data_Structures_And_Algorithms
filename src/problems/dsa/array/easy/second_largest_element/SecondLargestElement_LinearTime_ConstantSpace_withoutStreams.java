package problems.dsa.array.easy.second_largest_element;

public class SecondLargestElement_LinearTime_ConstantSpace_withoutStreams {
    /**
     * O(n):O(1)
     */
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3};
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No Second largest element found.");
        } else {
            System.out.println("Second Largest Element : " + secondLargest);
        }

    }

}
