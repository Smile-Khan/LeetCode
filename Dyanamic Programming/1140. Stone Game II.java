package Dyanamic Programming;

public class 1140. Stone Game II {
    
    QUESTION :-

    https://leetcode.com/problems/stone-game-ii/description/?envType=daily-question&envId=2024-08-20

}

SOLUTION:-



public class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n + 1];
        int[] suffixSum = new int[n];
        
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }
        
        return helper(piles, dp, suffixSum, 0, 1);
    }
    
    private int helper(int[] piles, int[][] dp, int[] suffixSum, int i, int M) {
        if (i == piles.length) return 0;
        if (dp[i][M] > 0) return dp[i][M];
        
        int maxStones = 0;
        for (int X = 1; X <= 2 * M && i + X <= piles.length; X++) {
            maxStones = Math.max(maxStones, suffixSum[i] - helper(piles, dp, suffixSum, i + X, Math.max(M, X)));
        }
        
        dp[i][M] = maxStones;
        return maxStones;
    }
}

//////////////////////////////////

public class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n + 1];
        int[] suffixSum = new int[n];
        
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }
        
        return helper(piles, dp, suffixSum, 0, 1);
    }
    
    private int helper(int[] piles, int[][] dp, int[] suffixSum, int i, int M) {
        if (i == piles.length) return 0;
        if (dp[i][M] > 0) return dp[i][M];
        
        int maxStones = 0;
        for (int X = 1; X <= 2 * M && i + X <= piles.length; X++) {
            maxStones = Math.max(maxStones, suffixSum[i] - helper(piles, dp, suffixSum, i + X, Math.max(M, X)));
        }
        
        dp[i][M] = maxStones;
        return maxStones;
    }
}

