public class 1137. N-th Tribonacci Number {
    

    https://leetcode.com/problems/n-th-tribonacci-number/description/?envType=daily-question&envId=2024-04-24


}

SOLUTION :-

class Solution {
    public int tribonacci(int n) {
      if (n < 2)
        return n;
  
      int[] dp = {0, 1, 1};
  
      for (int i = 3; i <= n; ++i) {
        final int next = dp[0] + dp[1] + dp[2];
        dp[0] = dp[1];
        dp[1] = dp[2];
        dp[2] = next;
      }
  
      return dp[2];
    }
  }
