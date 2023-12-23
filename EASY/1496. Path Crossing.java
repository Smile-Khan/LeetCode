public class 1496. Path Crossing {
    

    https://leetcode.com/problems/path-crossing/description/?envType=daily-question&envId=2023-12-23

import java.util.HashSet;
import java.util.Set;

}

SOLUTION :-

class Solution {
    public boolean isPathCrossing(String path) {
         Set<String> set = new HashSet<>();

        int x = 0;
        int y = 0;
        String key = x + "_" + y;
        set.add(key);

        for (char ch : path.toCharArray()) {
            if (ch == 'E') {
                x += 1;
            } else if (ch == 'W') {
                x -= 1;
            } else if (ch == 'N') {
                y += 1;
            } else {
                y -= 1;
            }

            key = x + "_" + y;
            if (set.contains(key)) {
                return true;
            }

            set.add(key);
        }

        return false;
    }
}
