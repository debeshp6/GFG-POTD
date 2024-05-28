class Solution {
    public static int minimumCost(int n, int w, int[] cost) {
        int dp[] = new int[w + 1];
        for(int i = 0; i <= w; i++)
            dp[i] = Integer.MAX_VALUE;
        
        dp[0] = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= w; j++)
                dp[j] = Math.min(dp[j], cost[i] + dp[j - i - 1]); 
    
        return dp[w];
    }
}
