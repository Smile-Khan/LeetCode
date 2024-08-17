package Dyanamic Programming;

public class 1937. Maximum Number of Points with Cost {
    
    QUESTION LINK: -

    https://leetcode.com/problems/maximum-number-of-points-with-cost/description/?envType=daily-question&envId=2024-08-17

}

-----------------JAVA-------------------

class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        long[] prev = new long[n];

        // First row
        for(int col = 0; col < n; col++)
        {
            prev[col] = points[0][col];
        }

        // Process each subsequent row
        for(int i = 1; i<m; i++)
        {
            long[] curr = new long[n];
            long[] left = new long[n];
            long[] right = new long[n];

            // Fill left array
            left[0] = prev[0];
            for(int j = 1; j<n; j++)
            {
                left[j] = Math.max(prev[j], left[j - 1] - 1);
            }

            // Fill right array
            right[n - 1] = prev[n - 1];
            for(int j = n - 2; j >= 0; j--)
            {
                right[j] = Math.max(prev[j], right[j + 1] - 1);
            }

            // Calculate current 'row's maximum points
            for(int j = 0; j<n; j++)
            {
                curr[j] = points[i][j] + Math.max(left[j], right[j]);
            }

            // Update prev array for the next iteration
            prev = curr;
        }

        long max = Long.MIN_VALUE;
        for(long val : prev)
        {
            max = Math.max(max, val);
        }
        return max;
    }
}

----------------PYTHON------------------

class Solution(object):
    def maxPoints(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """
        m, n = len(points), len(points[0])
        prev = points[0]
        
        for i in range(1, m):
            curr = [0] * n
            left = [0] * n
            right = [0] * n
            
            left[0] = prev[0]
            for j in range(1, n):
                left[j] = max(left[j - 1] - 1, prev[j])
            
            right[n - 1] = prev[n - 1]
            for j in range(n - 2, -1, -1):
                right[j] = max(right[j + 1] - 1, prev[j])
            
            for j in range(n):
                curr[j] = points[i][j] + max(left[j], right[j])
            
            prev = curr
        
        return max(prev)
