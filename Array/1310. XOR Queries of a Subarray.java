public class 1310. XOR Queries of a Subarray {
    
    QUESTION LINK:
    https://leetcode.com/problems/xor-queries-of-a-subarray/editorial/?envType=daily-question&envId=2024-09-13
}


//OPTIMAL SOLUTION

class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int n = arr.length;

        // Create an array to store the cumulative XOR values

        int[] xorArray = new int[n];
        xorArray[0] = arr[0];

        // Calculate the cumulative XOR values for the array.

        for(int i = 1; i < n; i++)
        {
            xorArray[i] = xorArray[i - 1] ^ arr[i];
        }

        // Create a result array to store the XOR values for each query
        int[] result = new int[queries.length];

        // Process each query.
        for(int i = 0; i < queries.length; i++)
        {
            int L = queries[i][0];
            int R = queries[i][1];

            // Calculate the XOR for the subarray from L to R.
            result[i] = xorArray[R] ^ (L == 0 ? 0 : xorArray[L - 1]);
        }

        // Return the result array
        return result;
    }
}


// ITERATIVE APPROACH 

class Solution {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        // Process each query
        for (int i = 0; i < queries.length; i++) {
            int xorSum = 0;
            // Calculate XOR for the range [q[0], q[1]]
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                xorSum ^= arr[j];
            }
            result[i] = xorSum;
        }
        return result;
    }
}