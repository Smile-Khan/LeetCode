QUESTION :- 316. Remove Duplicate Letters

https://leetcode.com/problems/remove-duplicate-letters/description/?envType=daily-question&envId=2023-09-26

import java.util.Stack;

SOLUTION :-

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i; 
        }

        boolean[] seen = new boolean[26]; 
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            int currentChar = s.charAt(i) - 'a';
            if (seen[currentChar]) continue; 
                while (!stack.isEmpty() && stack.peek() > currentChar && i < lastIndex[stack.peek()]) {
                seen[stack.pop()] = false;
            }
            
            stack.push(currentChar); 
            seen[currentChar] = true;
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append((char) (stack.pop() + 'a'));
        }
        return result.reverse().toString();
    }
}