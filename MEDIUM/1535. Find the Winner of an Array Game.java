QUESTION :- 1535. Find the Winner of an Array Game {
    

    https://leetcode.com/problems/find-the-winner-of-an-array-game/description/?envType=daily-question&envId=2023-11-05


}


Solution :-

class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        int maxEl = Integer.MIN_VALUE;

        for (int num : arr) {
            maxEl = Math.max(maxEl, num);
        }

        if (k >= n) {
            return maxEl;
        }

        int winner = arr[0];
        int wins = 0;

        for (int i = 1; i < n; i++) {
            if (winner > arr[i]) {
                wins++;
            } else {
                winner = arr[i];
                wins = 1;
            }

            if (wins == k || winner == maxEl) {
                return winner;
            }
        }

        return winner;
    }
}
