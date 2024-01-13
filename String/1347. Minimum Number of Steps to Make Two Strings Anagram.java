public class 1347. Minimum Number of Steps to Make Two Strings Anagram {
    

    https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/description/?envType=daily-question&envId=2024-01-13


}


SOLUTION :-


class Solution {
    public int minSteps(String s, String t) {
        int n = s.length();

        int[] mp = new int[26];

        for(int i = 0; i<n; i++)
        {
            mp[s.charAt(i) - 'a']++;
            mp[t.charAt(i) - 'a']--;
        }

        int result = 0;

        for(int i = 0; i<26; i++)
        {
            result += Math.max(0,mp[i]);
        }
        return result;
    }
}
