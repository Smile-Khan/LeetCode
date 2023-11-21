QUESTION :- 1814. Count Nice Pairs in an Array {
    

    https://leetcode.com/problems/count-nice-pairs-in-an-array/description/?envType=daily-question&envId=2023-11-21


}


SOLUTION:-



// class Solution {

//     final int M = 1000000007;

//     public int reverse(int num)
//     {
//         int rev = 0;

//         while(num > 0)
//         {
//             int rem = num % 10;
//             rev = rev * 10 + rem;
//             num /= 10;

//         }
//         return rev;
//     }
//     public int countNicePairs(int[] nums) {
        

//         int n = nums.length;

//         Map<Integer,Integer> mp = new HashMap<>();

//         for(int i = 0; i<n; i++)
//         {
//             nums[i] = nums[i] - reverse(nums[i]);
            
//         } 
//         int result = 0;

//         for(int i = 0; i < n; i++)
//         {
//             result = (int) (result + mp.getOrDefault(nums[i],0))%M;
//             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1); 
//         }
//         return result;
//     }
// }

class Solution {
    public int countNicePairs(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] - rev(nums[i]);
        }
        
        Map<Integer, Integer> dic = new HashMap();
        int ans = 0;
        int MOD = (int) 1e9 + 7;
        for (int num : arr) {
            ans = (ans + dic.getOrDefault(num, 0)) % MOD;
            dic.put(num, dic.getOrDefault(num, 0) + 1);
        }
        
        return ans;
    }
    
    public int rev(int num) {
        int result = 0;
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        
        return result;
    }
}
