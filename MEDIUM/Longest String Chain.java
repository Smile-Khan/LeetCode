QUESTION :- 


1048. Longest String Chain

https://leetcode.com/problems/longest-string-chain/?envType=daily-question&envId=2023-09-23

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

SOLUTION :-

class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;
        
        for (String word : words) {
            int longest = 0;
            for (int i = 0; i < word.length(); i++) {
                StringBuilder sub = new StringBuilder(word);
                sub.deleteCharAt(i);
                String subStr = sub.toString();
                longest = Math.max(longest, map.getOrDefault(subStr, 0) + 1);
            }
            map.put(word, longest);
            ans = Math.max(ans, longest);
        }
        
        return ans;
    }
}