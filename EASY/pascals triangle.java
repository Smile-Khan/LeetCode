import java.util.ArrayList;
import java.util.List;

public class pascals triangle {
    
}


https://leetcode.com/problems/pascals-triangle-ii/?envType=daily-question&envId=2023-10-16


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