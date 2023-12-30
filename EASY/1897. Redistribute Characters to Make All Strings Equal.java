public class 1897. Redistribute Characters to Make All Strings Equal {
    

    https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/description/?envType=daily-question&envId=2023-12-30

import java.util.Arrays;

}


class Solution {
    public boolean makeEqual(String[] words) {

        // APPROACH 1 :- USING HASHMAP TO STORE FREQUENCY
    //    int n = words.length;

    //    Map<Character,Integer> count = new HashMap<>();

    //    for(String word : words)
    //    {
    //        for(char ch : word.toCharArray())
    //        {
    //            count.put(ch,count.getOrDefault(ch,0)+1);
    //        }
    //    } 

    //    for(int value : count.values())
    //    {
    //        if(value % n != 0)
    //        {
    //            return false;
    //        }
    //    }
    //    return true;

    // APPROACH 2 :-

    // int n = words.length;

    // int[] count = new int[26];

    // for(String word : words)
    // {
    //     for(char ch : word.toCharArray())
    //     {
    //         count[ch - 'a']++;
    //     }
    // }

    // for(int i = 0; i<26; i++)
    // {
    //     if(count[i] % n != 0)
    //     {
    //         return false;
    //     }
    // }
    // return true;


    // APPROACH 3 :- USING LIBRARY AND ARRAY AS HASHMAP

    int n = words.length;

    int[] count = new int[26];

    for(String word : words)
    {
        for(char ch : word.toCharArray())
        {
            count[ch - 'a']++;
        }
    }

    return Arrays.stream(count).allMatch(c -> c % n == 0);
    }
}
