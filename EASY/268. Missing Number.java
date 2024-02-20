public class 268. Missing Number {
    

    https://leetcode.com/problems/missing-number/description/?envType=daily-question&envId=2024-02-20

}

SOLUTION:-

class Solution {
   

public int missingNumber(int[] nums) {

    int xor = 0, i = 0;
	for (i = 0; i < nums.length; i++) {
		xor = xor ^ i ^ nums[i];
	}

	return xor ^ i;
}
}
