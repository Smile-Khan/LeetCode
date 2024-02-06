public class 49. Group Anagrams {
    

    https://leetcode.com/problems/group-anagrams/description/?envType=daily-question&envId=2024-02-06

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

}

SOLUTION :-

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs)
        {
            char[] charArray = str.toCharArray();

            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if(!map.containsKey(sortedStr))
            {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
