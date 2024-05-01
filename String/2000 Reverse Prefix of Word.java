public class 2000 Reverse Prefix of Word {
    

    https://leetcode.com/problems/reverse-prefix-of-word/description/?envType=daily-question&envId=2024-05-01

import java.util.Stack;

}

SOLUTION :-

public class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        int index = 0;
        while (index < word.length()) {
            stack.push(word.charAt(index));
            // Found ch
            if (word.charAt(index) == ch) {
                // Add characters through ch to the result in reverse order
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                index++;
                // Add the rest of the characters to result
                while (index < word.length()) {
                    result.append(word.charAt(index));
                    index++;
                }
                return result.toString();
            }
            index++;
        }

        return word;
    }
}
