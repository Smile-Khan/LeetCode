package String;

QUESTION :- 1662. Check if Two String Arrays are Equivalent {
    

    https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/?envType=daily-question&envId=2023-12-01
}

SOLUTION :-

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";

        for(int i=0 ; i<word1.length ; i++){ // here we are storing first array
            s1 += word1[i];
        }

        for(int i=0; i<word2.length; i++) // here we are storing second array
        {
            s2 += word2[i];
        }
        return s1.equals(s2);
    }
}
