package Array;

import java.util.HashMap;
import java.util.Map;

QUESTION  :- 1287. Element Appearing More Than 25% In Sorted Array {
    

    https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/description/?envType=daily-question&envId=2023-12-11


}


SOLUTION :-

class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> counts = new HashMap();
        int target = arr.length / 4;
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) > target) {
                return num;
            }
        }

        return -1;
    }
}
