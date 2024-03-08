package Array;

public class 3005. Count Elements With Maximum Frequency {
    
    https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=daily-question&envId=2024-03-08

}

SOLUTION :-

class Solution {
    public int maxFrequencyElements(int[] nums) {
         int[] arr = new int[101];

        int maxFreq = 0;
        int total = 0;

        for (int num : nums) {
            arr[num]++;

            int freq = arr[num];

            if (freq > maxFreq) {
                maxFreq = freq;
                total = freq;
            } else if (freq == maxFreq) {
                total += freq;
            }
        }

        return total;
    }
}
