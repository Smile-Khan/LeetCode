package Array;

import java.util.Stack;

public class 739. Daily Temperatures {
    
    https://leetcode.com/problems/daily-temperatures/description/?envType=daily-question&envId=2024-01-31


}

SOLUTION :-

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;

        Stack<Integer> st = new Stack<>();

        int[] result = new int[n];

        for(int i = n-1; i >= 0; i--)
        {
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()])
            {
                st.pop();
            }

            if(st.empty())
            {
                result[i] = 0;
            }
            else 
            {
                result[i] = st.peek() - i;
            }
            st.push(i);
        }
        return result;
    }
}
