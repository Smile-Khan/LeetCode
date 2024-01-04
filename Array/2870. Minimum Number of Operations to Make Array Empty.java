package Array;

import java.util.HashMap;

public class 2870. Minimum Number of Operations to Make Array Empty {
    

    https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/description/?envType=daily-question&envId=2024-01-04


}


SOLUTION :-

class Solution {
    public int minOperations(int[] nums) {
        var counter = new HashMap<Integer, Integer>();
        for (int num: nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (int c: counter.values()) {
            if (c == 1) {
                return -1;
            }
            ans += Math.ceil((double) c / 3);
        }
        return ans;
    }
}
