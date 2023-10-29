QUESTION :-  458. Poor Pigs {
    

    https://leetcode.com/problems/poor-pigs/description/?envType=daily-question&envId=2023-10-29

    
}


SOLUTION :-

public class Solution {
    public int poorPigs(int buckets, int timeToDie, int timeToTest) {
        int testsPerPig = timeToTest / timeToDie;
        int numPigs = 0;
        int states = 1; // Number of unique states a pig can represent   
        while (states < buckets) {
            states *= (testsPerPig + 1);
            numPigs++;
        }
        return numPigs;
    }
}