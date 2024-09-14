package Array;

public class 2419. Longest Subarray With Maximum Bitwise AND {
 
    QUESTION LINK:
    https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/description/?envType=daily-question&envId=2024-09-14

}

--------------------JAVA-------------
class Solution {
    public int longestSubarray(int[] nums) {
        int maxValue = 0;
        int result = 0;
        int streak = 0;

        for(int num : nums)
        {
            if(num > maxValue)
            {
                maxValue = num;
                result = 0;
                streak = 0;
            }

            if(maxValue == num)
            {
                streak++;
            }
            else
            {
                streak = 0;
            }
            result = Math.max(result,streak);
        }
        return result;
    }
}


---------------------PYTHON----------------------

class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        max_val = ans = current_streak = 0
        for num in nums:
            if max_val < num:
                max_val = num
                ans = current_streak = 0

            if max_val == num:
                current_streak += 1
            else:
                current_streak = 0

            ans = max(ans, current_streak)
        return ans

