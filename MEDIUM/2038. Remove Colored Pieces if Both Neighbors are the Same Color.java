QUESTION :- 2038. Remove Colored Pieces if Both Neighbors are the Same Color 

https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/?envType=daily-question&envId=2023-10-02

SOLUTION :-



class Solution {
    public boolean winnerOfGame(String colors) {
        int alice = 0;
        int bob = 0;
        
        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)) {
                if (colors.charAt(i) == 'A') {
                    alice++;
                } else {
                    bob++;
                }
            }
        }
        
        return alice - bob >= 1;
    }
}