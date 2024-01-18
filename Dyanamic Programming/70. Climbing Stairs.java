package Dyanamic Programming;

public class 70. Climbing Stairs {
    

    https://leetcode.com/problems/climbing-stairs/description/?envType=daily-question&envId=2024-01-18


}


class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2 || n == 3)
            return n;
        
        int a = 1;
        int b = 2;
        int c = 3;
        
        for(int i = 3; i<=n; i++) {
            c = a + b;
            
            int temp_b = b;
            b = c;
            a = temp_b;
            
        }
        return c;
    }
}