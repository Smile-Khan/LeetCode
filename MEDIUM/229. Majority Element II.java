 QUESTION :- 229. Majority Element II 

 https://leetcode.com/problems/majority-element-ii/description/?envType=daily-question&envId=2023-10-05

import java.util.ArrayList;
import java.util.List;

SOLUTION :-



public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
        
        for (int num : nums) {
            if (candidate1 == num) count1++;
            else if (candidate2 == num) count2++;
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        count1 = count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }
        
        List<Integer> ans = new ArrayList<>();
        if (count1 > nums.length / 3) ans.add(candidate1);
        if (count2 > nums.length / 3) ans.add(candidate2);
        
        return ans;
    }
}