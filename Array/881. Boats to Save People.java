package Array;

import java.util.Arrays;

public class 881. Boats to Save People {
    
    https://leetcode.com/problems/boats-to-save-people/description/?envType=daily-question&envId=2024-05-04

}

SOLUTION :-


class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int i=0, j = people.length -1;
        int ans = 0;

        while(i <= j)
        {
            ans++;
            if(people[i] + people[j] <= limit)
            i++;
            j--;
        }   
        return ans;
    }
}
