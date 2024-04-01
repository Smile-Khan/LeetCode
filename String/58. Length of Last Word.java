public class 58. Length of Last Word {
    
    https://leetcode.com/problems/length-of-last-word/description/?envType=daily-question&envId=2024-04-01

}

SOLUTION :-

class Solution {
    public int lengthOfLastWord(String s) {
        // s = s.trim();

        // int length = 0;
        // int i = s.length() - 1;

        // while(i >= 0 && s.charAt(i) != ' ')
        // {
        //     length++;
        //     i--;
        // }
        // return length;

        int n = s.length();
        if (n == 0)
            return 0;
        int i = n - 1;
        while (i >= 0 && s.charAt(i) == ' ')
            i--;

        int length = 0;
        for (; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            length++;
        }
        return length;
    }
}
