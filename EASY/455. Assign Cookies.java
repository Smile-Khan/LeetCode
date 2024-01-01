public class 455. Assign Cookies {
 
    
    https://leetcode.com/problems/assign-cookies/description/?envType=daily-question&envId=2024-01-01

import java.util.Arrays;

}


SOLUTION :-

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;
        int cookieIndex = 0;
        while (cookieIndex < s.length && contentChildren < g.length) {
            if (s[cookieIndex] >= g[contentChildren]) {
                contentChildren++;
            }
            cookieIndex++;
        }
        return contentChildren;
    }

}
