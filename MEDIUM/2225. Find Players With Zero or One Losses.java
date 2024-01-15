public class 2225. Find Players With Zero or One Losses {
    

https://leetcode.com/problems/find-players-with-zero-or-one-losses/description/?envType=daily-question&envId=2024-01-15

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

}


class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        Map<Integer, Integer> losses = new TreeMap<>();
        for(int[] m : matches){
            losses.put(m[0], losses.getOrDefault(m[0], 0));
            losses.put(m[1], losses.getOrDefault(m[1], 0) + 1);
        }
        List<List<Integer>> r = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for(Integer player : losses.keySet())
            if(losses.get(player) <= 1)
                r.get(losses.get(player)).add(player);
        return r;
    }
    }
