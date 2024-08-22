public class 476. Number Complement {
    
    QUESTION LINK :

    https://leetcode.com/problems/number-complement/description/?envType=daily-question&envId=2024-08-22


}

class Solution {
    public int findComplement(int num) {
        int numOfBits = (int)(Math.log(num) / Math.log(2)) + 1;

        for(int i = 0; i<numOfBits; i++)
        {
            num = num ^ (1 << i); // XOR to FLIP
        }
        return num;
    }
}