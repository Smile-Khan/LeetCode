QUESTION :- 342. Power of Four {
    

    https://leetcode.com/problems/power-of-four/description/?envType=daily-question&envId=2023-10-23


}


SOLUTION :-


class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1)
        {
            return true;
        }
        else if(n%4==0 && n > 1)
        {
            return isPowerOfFour(n/4);
        } else 
        {
            return false;
        }
    }
}
