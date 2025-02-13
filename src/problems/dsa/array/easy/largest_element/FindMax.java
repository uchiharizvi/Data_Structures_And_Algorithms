package problems.dsa.array.easy.largest_element;

public class FindMax {
    public static void main(String[] args) {
        int[] input = {10, 20, 5, 8, 70, 15};
        System.out.println("Max Element : " + findMax(input));
    }

    /** O(n)/O(1)
     * @param input
     * @return
     */
    private static int findMax(int[] input) {
        int max = input[0]; //Assume 1st element is the maximum
        //Traverse the array to find the maximum
        for (int i=1;i<input.length;i++) {
            if(input[i]> max) {
                max = input[i];
            }
        }
        return max;
    }
}
