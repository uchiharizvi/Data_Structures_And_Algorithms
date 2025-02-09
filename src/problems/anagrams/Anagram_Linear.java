package problems.anagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Write a function to check if two strings are anagrams of each other.
 **/
public class Anagram_Linear {
    /**
     * Linear Time Avg Case
     * Linear Space Best Case
     *
     * @param args
     */
    public static void main(String[] args) {
        String wordA = "listen";//Linear Time/Linear Space
        String wordB = "silent";//Linear Time/Linear Space
        System.out.println(areAnagrams(wordA, wordB));
    }

    /**
     * Linear Time
     * Constant Space
     *
     * @param s1
     * @param s2
     * @return
     */
    private static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; // Constant Time/Constant Space
        }
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : s1.toCharArray()) {// Linear Time/Constant Space
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {// Linear Time/Constant Space
            frequency.put(c, frequency.getOrDefault(c, 0) - 1);
        }
        return frequency.values().stream().allMatch(count -> count == 0);//// Linear Time/Constant Space
    }
}
