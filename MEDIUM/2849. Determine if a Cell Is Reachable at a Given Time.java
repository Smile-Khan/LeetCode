QUESTION :- 2849. Determine if a Cell Is Reachable at a Given Time {
    

    https://leetcode.com/problems/determine-if-a-cell-is-reachable-at-a-given-time/description/?envType=daily-question&envId=2023-11-08


}


SOLUTION :-

class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        
         int vertDist = Math.abs(sy - fy);
        int horDist = Math.abs(sx - fx);

        if (vertDist == 0 && horDist == 0 && t == 1) {
            return false;
        }

        return t >= Math.max(vertDist, horDist);
    }
}
