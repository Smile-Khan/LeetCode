public class 387. First Unique Character in a String {
 
    
    https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=daily-question&envId=2024-02-05


}

SOLUTION :-

class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();

        // Build char count bucket : <charIndex, count>

        for(int i=0; i<n; i++)
        {
            int index = s.charAt(i) -'a';
            count[index]++;
        }

        // Find the index;

        for(int i=0; i<n; i++)
        {
            int index = s.charAt(i)-'a';
            if(count[index]==1)
            {
                return i;
            }
        }
        return -1;
    }
}
