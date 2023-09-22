    QUESTION :- (392. Is Subsequence)

    https://leetcode.com/problems/is-subsequence/description/?envType=daily-question&envId=2023-09-22


    SOLUTION :- 


    class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0;
        int tIdx = 0;

        while (sIdx < s.length() && tIdx < t.length()) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
            }
            tIdx++;
        }

        return sIdx == s.length();        
    }
}