QUESTION :- 1512. Number of Good Pairs


https://leetcode.com/problems/number-of-good-pairs/description/?envType=daily-question&envId=2023-10-03

import java.util.HashMap;
import java.util.Map;

SOLUTION :-

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int ans = 0;

        for (int num: nums) {
            ans += counts.getOrDefault(num, 0);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        return ans;
    }
}