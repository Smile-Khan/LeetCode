public class 576. Out of Boundary Paths {
    
    https://leetcode.com/problems/out-of-boundary-paths/description/?envType=daily-question&envId=2024-01-26


}

SOLUTION :-

class Solution {
  int MOD = 1000000007;
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
        int[][][] dp = new int[m][n][maxMove + 1];
        //dp[i][j][k] = the number of possible moves leading to a path out of the boundary if the current position is [i][j] and number of moves left is k.
        
        for (int k = 1; k <= maxMove; ++k) {
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    for (int[] dir : directions) {
                        int x = i + dir[0];
                        int y = j + dir[1];
                        if (x < 0 || x >= m || y < 0 || y >= n)
                            dp[i][j][k] = (dp[i][j][k] + 1) % MOD;
                        else
                            dp[i][j][k] = (dp[i][j][k] + dp[x][y][k - 1]) % MOD;
                    }
                }
            }
        }
        
        return dp[startRow][startColumn][maxMove];
    }
}
