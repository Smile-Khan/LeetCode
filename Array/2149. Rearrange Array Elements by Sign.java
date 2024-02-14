public class 2149. Rearrange Array Elements by Sign {
    
    https://leetcode.com/problems/rearrange-array-elements-by-sign/description/?envType=daily-question&envId=2024-02-14


}


SOLUTION :-

class Solution {
    public int[] rearrangeArray(int[] nums) {
         int n = nums.length;
        int pi = 0; // positive index
        int ni = 1; // negative index

        int[] result = new int[n];

        for (int num : nums) {
            if (num > 0) {
                result[pi] = num;
                pi += 2;
            } else {
                result[ni] = num;
                ni += 2;
            }
        }

        return result;
    }
}
