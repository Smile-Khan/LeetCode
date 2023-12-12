package Array;

import java.util.Arrays;

QUESTION :- 1464. Maximum Product of Two Elements in an Array {
    

    https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/?envType=daily-question&envId=2023-12-12


}


SOLUTION :-

class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int x = nums[nums.length - 1];
        int y = nums[nums.length - 2];
        return (x - 1) * (y - 1);
    }
}
