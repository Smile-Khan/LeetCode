QUESTION :- 844. Backspace String Compare {
    

https://leetcode.com/problems/backspace-string-compare/description/?envType=daily-question&envId=2023-10-19

import java.util.Stack;

}

SOLUTION :-


class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String s)
    {
        Stack<Character> ans = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c != '#')
            ans.push(c);
            else if(!ans.empty())
            ans.pop();
        }
        return String.valueOf(ans);
    }
}
