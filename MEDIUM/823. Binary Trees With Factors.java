QUESTION :- 823. Binary Trees With Factors {
    
    https://leetcode.com/problems/binary-trees-with-factors/description/?envType=daily-question&envId=2023-10-26

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

}

SOLUTION :-


public class Solution {
    private static final int MOD = 1000000007;

    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> s = new HashSet<>();
        for (int x : arr) s.add(x);

        Map<Integer, Integer> dp = new HashMap<>();
        for (int x : arr) dp.put(x, 1);
        
        for (int i : arr) {
            for (int j : arr) {
                if (j > Math.sqrt(i)) break;
                if (i % j == 0 && s.contains(i / j)) {
                    long temp = (long) dp.get(j) * dp.get(i / j);
                    dp.put(i, (int) ((dp.get(i) + (i / j == j ? temp : temp * 2)) % MOD));
                }
            }
        }
        
        int result = 0;
        for (int val : dp.values()) {
            result = (result + val) % MOD;
        }
        return result;
    }
}
