QUESTION :- 1160. Find Words That Can Be Formed by Characters {
    

    https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/description/?envType=daily-question&envId=2023-12-02


}

SOLUTION :-

class Solution {
    public int countCharacters(String[] words, String chars) {
         int[] charCount = new int[26];

        for (char ch : chars.toCharArray()) {
            charCount[ch - 'a']++;
        }

        int result = 0;

        for (String word : words) {
            int[] wordCount = new int[26];
            for (char ch : word.toCharArray()) {
                wordCount[ch - 'a']++;
            }

            boolean ok = true;
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] > charCount[i]) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                result += word.length();
            }
        }

        return result;
    }
}
