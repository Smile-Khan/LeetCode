package Array;

import java.util.ArrayList;
import java.util.List;

public class 442. Find All Duplicates in an Array {
    
    https://leetcode.com/problems/find-all-duplicates-in-an-array/description/?envType=daily-question&envId=2024-03-25

}


SOLUTION :-

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);

            if (nums[num - 1] < 0) {
                result.add(num);
            } else {
                nums[num - 1] *= -1;
            }
        }

        return result;
    }
}