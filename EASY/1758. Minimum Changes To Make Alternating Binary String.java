public class 1758. Minimum Changes To Make Alternating Binary String {
    

    https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/?envType=daily-question&envId=2023-12-24


}

SOLUTION :-

class Solution {
    public int minOperations(String s) {
        
        //Approach-1 (String can start from 0, string can start from 1)

        
        int n = s.length();
        int start_with_0 = 0; // 010101
        int start_with_1 = 0; // 101010

        for(int i = 0; i<n; i++)
        {
            if(i % 2 == 0)
            {
                if(s.charAt(i) == '0')
                {
                    start_with_1++;
                }
                else 
                {
                    start_with_0++;
                }
            }
            else 
            {
                if(s.charAt(i) == '1')
                {
                    start_with_1++;
                }
                else
                {
                    start_with_0++;
                }
            }
        }
        return Math.min(start_with_0, start_with_1);


    }
}
