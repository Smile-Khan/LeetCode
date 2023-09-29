QUESTION :- 896. Monotonic Array
https://leetcode.com/problems/monotonic-array/description/?envType=daily-question&envId=2023-09-29

SOLUTION :- 

class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length; 

        boolean increasing = false;
        boolean decreasing = false;

        for(int i=0; i<n-1; i++)
        {
            if(nums[i] < nums[i+1])
            {
                increasing = true;
            }
            if(nums[i] > nums[i+1])
            {
                decreasing = true;
            }
        }
        if(increasing == true && decreasing == true)
        {
                return false;
        }
        return true;
    }
}