class Solution {
  public static int findWinner(int n, int x, int y) {
        // Dynamic programming array to store the win/lose state for each number of coins
        boolean[] dp = new boolean[n + 1];
        
        // Base case: With 1 coin, Geek will win by picking the last coin
        dp[1] = true;

        // Iterate through all possible numbers of coins from 2 to n
        for (int i = 2; i <= n; i++) {
            // Initialize the current state to losing
            dp[i] = false;

            // Check if there's any move that forces the opponent into a losing state
            if (dp[i - 1] == false) {
                dp[i] = true; // Picking 1 coin leaves the opponent in a losing state
            } else if (i - x >= 0 && dp[i - x] == false) {
                dp[i] = true; // Picking x coins leaves the opponent in a losing state
            } else if (i - y >= 0 && dp[i - y] == false) {
                dp[i] = true; // Picking y coins leaves the opponent in a losing state
            }
        }

        // Return 1 if Geek can win with n coins, otherwise return 0
        return dp[n] ? 1 : 0;
    }
}
