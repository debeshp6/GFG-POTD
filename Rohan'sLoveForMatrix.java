// User function Template for Java
class Solution {
    static int mod = 1000000007;
    static int firstElement(int n) {
        // code here
        int dp[] = new int[n + 1];
        dp[0] = 0 ; dp[1] = 1;
        for(int i = 2; i <= n; i++)
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
            
        return dp[n];
    }
}
