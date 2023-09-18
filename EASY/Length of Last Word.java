
QUESTION :- https://leetcode.com/problems/length-of-last-word/



SOLUTION :- 





class Solution {
    public int lengthOfLastWord(String s) {
        // Remove leading and trailing spaces.
        s = s.trim(); // Trim spaces from the beginning and end of the string.
        
        int length = 0; // Initialize the length of the last word.
        int i = s.length() - 1; // Start from the last character of the trimmed string.
        
        // Iterate through the string from right to left.
        while (i >= 0 && s.charAt(i) != ' ') {
            length++; // Increment the length for each non-space character.
            i--; // Move to the previous character in the string.
        }
        
        return length; // Return the length of the last word.
    }
}
