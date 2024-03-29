public class 2485. Find the Pivot Integer {
    
    https://leetcode.com/problems/find-the-pivot-integer/?envType=daily-question&envId=2024-03-13

}

SOLUTION :-

public class Solution {
    public int pivotInteger(int n) {
        // Iterate through possible pivot values
        for (int i = 1; i <= n; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            // Calculate the sum of elements on the left side of the pivot
            for (int j = 1; j <= i; j++) {
                sumLeft += j;
            }

            // Calculate the sum of elements on the right side of the pivot
            for (int k = i; k <= n; k++) {
                sumRight += k;
            }

            // Check if the sums on both sides are equal
            if (sumLeft == sumRight) {
                return i; // Return the pivot value if found
            }
        }

        return -1; // Return -1 if no pivot is found
    }
}
