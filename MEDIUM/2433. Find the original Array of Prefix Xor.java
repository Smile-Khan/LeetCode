QUESTION :- 2433. Find the original Array of Prefix Xor {
    

    https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/?envType=daily-question&envId=2023-10-31


}


SOLUTION :-


class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;

        int[] result = new int[n];

        result[0] = pref[0];

        for(int i = 1; i<n; i++)
        {
            result[i] = pref[i] ^ pref[i-1];
        }
        return result;


        //  int n = pref.length;

        // for (int i = n - 1; i > 0; i--) {
        //     pref[i] = pref[i] ^ pref[i - 1];
        // }

        // return pref;
    }
}
