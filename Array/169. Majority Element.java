package Array;

import java.util.Arrays;

public class 169. Majority Element {
    

    https://leetcode.com/problems/majority-element/description/?envType=daily-question&envId=2024-02-12

}

SOLUTION :-

class Solution {
    public int majorityElement(int[] nums) {
        //boolean found = false;
    //     int c = 0;
    //     for(int i=1; i<nums.length; i++)
    //     {
    //         if(nums[i] == nums/2)
    //         {
    //         // found = true;
    //         // System.out.print(i + " ");
    //         c++;
    //     }
    //     }
    //     // if(!found){
    //     //     System.out.print(-1);
    // // } 
    // return c;

    Arrays.sort(nums);
   return nums[nums.length/2];

        }
}
