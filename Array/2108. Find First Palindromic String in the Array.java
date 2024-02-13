package Array;

public class 2108. Find First Palindromic String in the Array {
    

    https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/?envType=daily-question&envId=2024-02-13


}

SOLUTION :-

class Solution {
    public String firstPalindrome(String[] words) {
        // Reverse String

        // for(String word : words)
        // {
        //     String reversed = new StringBuilder(word).reverse().toString();

        //     if(word.equals(reversed))
        //     {
        //         return word;
        //     }
        // }
        // return "";

        // USING 2 POINTER

         for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
