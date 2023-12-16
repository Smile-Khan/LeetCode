public class 242. Valid Anagram {
    


    https://leetcode.com/problems/valid-anagram/description/?envType=daily-question&envId=2023-12-16


}


SOLUTION :-

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
        return false;
        }

        int[] freq = new int[26];

        for(int i = 0; i<s.length(); i++)
        {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int i=0; i< freq.length; i++)
        {
            if(freq[i] != 0)
            {
                return false;
            }
        }
        return true;


    }
    
}