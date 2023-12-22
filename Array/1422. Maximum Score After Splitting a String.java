package Array;

public class 1422. Maximum Score After Splitting a String {
    

    https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/?envType=daily-question&envId=2023-12-22


}


SOLUTION :-

class Solution {
    public int maxScore(String s) {

        // BRUTE FORCE
        // int n = s.length();
        // int result = Integer.MIN_VALUE;

        // for(int i = 0; i<n-1; i++)
        // {
        //     int zeroLeft = 0;
        //     for(int j = 0; j <= i; j++)
        //     {
        //         if(s.charAt(j) == '0')
        //         {
        //             zeroLeft++;
        //         }
        //     }
        //     int oneRight = 0;
        //     for(int j = i + 1; j < n; j++)
        //     {
        //         if(s.charAt(j)=='1')
        //         {
        //             oneRight++;
        //         }
        //     }
        //     result = Math.max(result, zeroLeft + oneRight);
        // }
        // return result;

        // OPTIMAL 1

        // int n = s.length();
        // int result = Integer.MIN_VALUE;
        // int totalOnes = (int) s.chars().filter(ch -> ch == '1').count();

        // int zeros = 0;

        // for(int i = 0; i<n-1; i++)
        // {
        //     if(s.charAt(i) == '1')
        //     {
        //         totalOnes--;
        //     }
        //     else 
        //     {
        //         zeros++;
        //     }
        //     result = Math.max(result,zeros + totalOnes);
        // }
        // return result;


        int n = s.length();
        int result = Integer.MIN_VALUE;

        int zeros = 0;
        int ones = 0;

        for(int i = 0; i<n-1; i++)
        {
            if(s.charAt(i) == '1')
            {
                ones++;
            }
            else 
            {
                zeros++;
            }
            result = Math.max(result, zeros - ones);
        }
        if(s.charAt(n-1) == '1')
        {
            ones++;
        }
        return result + ones;
    }
}
