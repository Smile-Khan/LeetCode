public class 1624. Largest Substring Between Two Equal Characters {
    

    https://leetcode.com/problems/largest-substring-between-two-equal-characters/description/?envType=daily-question&envId=2023-12-31

import java.util.HashMap;
import java.util.Map;

}


SOLUTION :-

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> firstIndex = new HashMap();
        int ans = -1;
        
        for (int i = 0; i < s.length(); i++) {
            if (firstIndex.containsKey(s.charAt(i))) {
                ans = Math.max(ans, i - firstIndex.get(s.charAt(i)) - 1);
            } else {
                firstIndex.put(s.charAt(i), i);
            }
        }
        
        return ans;
    }
}
