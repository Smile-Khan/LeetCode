QUESTION :- 119. Pascal's Triangle II 


https://leetcode.com/problems/pascals-triangle-ii/description/?envType=daily-question&envId=2023-10-16

import java.util.ArrayList;
import java.util.List;

SOLUTION :-

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for (int k = 1; k <= rowIndex; k++) {
            long next_val = prev * (rowIndex - k + 1) / k;
            res.add((int) next_val);
            prev = next_val;
        }
        return res;
    }
}
