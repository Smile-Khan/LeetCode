QUESTION :- 557 Reverse Words in a String III 

https://leetcode.com/problems/reverse-words-in-a-string-iii/description/?envType=daily-question&envId=2023-10-01


SOLUTION :-

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        
        return result.toString().trim();
    }
}
