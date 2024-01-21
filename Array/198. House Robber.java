package Array;

public class 198. House Robber {
    

    https://leetcode.com/problems/house-robber/description/?envType=daily-question&envId=2024-01-21


}


SOLUTION :-

class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int norob = 0;
        for (int i = 0; i < nums.length; i ++) {
            int newRob = norob + nums[i];
            int newNoRob = Math.max(norob, rob);
            rob = newRob;
            norob = newNoRob;
        }
        return Math.max(rob, norob);
    }
}
