QUESTION :- 389. Find the Difference

https://leetcode.com/problems/find-the-difference/?envType=daily-question&envId=2023-09-25


SOLUTION :-

class Solution {
    public char findTheDifference(String s, String t) {
        // int a1 = 0;
        // int a2 = 0;
        // for(char c:s.toCharArray()) a1+=(int)c;
        // for(char c:t.toCharArray()) a2+=(int)c;
        // return (char)(a2-a1);
        char[] a = s.toCharArray(); // 5
        char[] b = t.toCharArray(); // 5+(1)
        int ans = 0;
        for(int i=0;i<a.length;i++){
            ans = ans + b[i] - a[i];
        }
        ans+= b[b.length-1];
        System.gc();
        return (char)ans;
    }
}