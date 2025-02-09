package problems.anagrams;

import java.util.Arrays;

/** Write a function to check if two strings are anagrams of each other. **/
public class Anagram_Linearithmic {
    /**
     * Linearithmic Time
     * Linear Space
     * @param args
     */
    public static void main(String[] args) {
        String wordA = "listen";//Linear Time/Linear Space
        String wordB = "silent";//Linear Time/Linear Space
        System.out.println(areAnagrams(wordA, wordB));
    }

    /**
     * Linearithmic Time
     * Constant Space
     * @param s1
     * @param s2
     * @return
     */
    private static boolean areAnagrams(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array); //Linearithmic Time/Constant Space
        Arrays.sort(s2Array);//Linearithmic Time/Constant Space
        return Arrays.equals(s1Array, s2Array);//Linear Time/Constant Space
    }
}
