QUESTION:- 34. Find First and Last Position of Element in Sorted Array 

https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=daily-question&envId=2023-10-09

SOLUTION :-

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int first = -1;
        int last = -1;
        int right = nums.length - 1;

        while(left <= right)
        {
            int mid = left + (right - left)/2;
            if(nums[mid] == target)
            {
                first = mid;
                last = mid;

                while(first > 0 && nums[first - 1] == target)
                {
                    first--;
                }
                while(last < nums.length - 1 && nums[last + 1] == target)
                {
                    last++;
                }
                break;

            } else if(nums[mid] < target)
            {
                left = mid + 1;
            } else 
            {
                right = mid - 1;
            }
        }
        return new int[] {first,last};
    }
}