package ds.string.problems.palindrome;

import java.util.stream.IntStream;

/**
 * Linear Time
 * Constant Space
 */
public class PalindromeProblemStreams {
    public static void main(String[] args) {
        String input = "madam";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    private static boolean isPalindrome(String input) {
        // Create a Stream of indexes (from 0 to half of string's length)
        // in case of odd, middle char will be ignored
        return IntStream.range(0, input.length()/2)
                //Check Characters
                //Compares from i to string.length - 1
                //if all match treturn true, it is a palindrome
                //if all match failse, returns false, (short-Circuit)
                .allMatch(i ->
                        input.charAt(i) == input.charAt(input.length() -1 - i));
    }

}
