package Recursion;

import java.util.Arrays;

public class 1913. Maximum Product Difference Between Two Pairs {
    

    https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description/?envType=daily-question&envId=2023-12-18


}e



SOLUTION :-

class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
