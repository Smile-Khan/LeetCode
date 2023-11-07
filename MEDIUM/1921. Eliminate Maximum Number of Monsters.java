QUESTION :- 1921. Eliminate Maximum Number of Monsters {
    

    https://leetcode.com/problems/eliminate-maximum-number-of-monsters/description/?envType=daily-question&envId=2023-11-07

import java.util.Arrays;

}

SOLUTION :-

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
         int n = dist.length;
        
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = (int) Math.ceil((double) dist[i] / speed[i]);
        }
        
        Arrays.sort(ans);
        
        int count = 1;
        
        int timePassed = 1;
        for (int i = 1; i < n; i++) {
            if (ans[i] - timePassed <= 0) {
                return count;
            }
            
            count++;
            timePassed++;
        }
        
        return count;
    }
}
