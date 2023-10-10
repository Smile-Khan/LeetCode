QUESTION :-  2009. Minimum Number of Operations to Make array continues 


https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/?envType=daily-question&envId=2023-10-10

import java.util.Arrays;
import java.util.HashSet;

SOLUTION :-


class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = n;
        
        HashSet<Integer> unique = new HashSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        
        int[] newNums = new int[unique.size()];
        int index = 0;
        
        for (int num : unique) {
            newNums[index++] = num;
        }
            
        Arrays.sort(newNums);
        
        for (int i = 0; i < newNums.length; i++) {
            int left = newNums[i];
            int right = left + n - 1;
            int j = binarySearch(newNums, right);
            int count = j - i;
            ans = Math.min(ans, n - count);
        }
        
        return ans;
    }
    
    public int binarySearch(int[] newNums, int target) {
        int left = 0;
        int right = newNums.length;
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (target < newNums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}