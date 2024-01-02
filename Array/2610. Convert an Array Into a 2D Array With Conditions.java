package Array;

import java.util.ArrayList;
import java.util.List;

public class 2610. Convert an Array Into a 2D Array With Conditions {
 
    
        https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/submissions/1134512054/?envType=daily-question&envId=2024-01-02


}


SOLUTION :-

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int freq[] = new int[nums.length + 1];

        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int c : nums) {
            if (freq[c] >= ans.size()) {
                ans.add(new ArrayList<>());
            }

            // Store the integer in the list corresponding to its current frequency.
            ans.get(freq[c]).add(c);
            freq[c]++;
        }

        return ans;
    }
}
