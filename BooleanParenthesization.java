//User function Template for Java

class Solution{
    
static int MOD = 1003;
    
    static int countWays(int n, String s){
        
        int[][][] dp = new int[n][n][2];
        
        for(int[][] mat : dp) {
            for(int[] row : mat) {
                Arrays.fill(row, -1);
            }
        }
        
        
        return helper(0, n-1, s, 1, dp);
    }
    
    private static int helper(int i, int j, String s, int isTrue, int[][][] dp) {
        
    if (i > j)
        return 0;

    if (i == j) {
        return (isTrue==1) ? (s.charAt(i) == 'T' ? 1 : 0) : (s.charAt(i) == 'F' ? 1 : 0);
    }
    
    if(dp[i][j][isTrue]!=-1) {
        return dp[i][j][isTrue];
    }

    long ways = 0;

    for (int index = i + 1; index <= j; index += 2) {
        
        for (char operator : new char[]{'&', '|', '^'}) {
        
            int lF = helper(i, index - 1, s, 0, dp);
            int rF = helper(index + 1, j, s, 0, dp);
            int lT = helper(i, index - 1, s, 1, dp);
            int rT = helper(index + 1, j, s, 1, dp);

            if (s.charAt(index) == operator) {
                if (operator == '&') {
                    if (isTrue==1) {
                        ways = (ways + (lT * rT) % MOD) % MOD;
                    } else {
                        ways = (ways + (lF * rT) % MOD + (lT * rF) % MOD + (lF * rF) % MOD) % MOD;
                    }
                } else if (operator == '|') {
                    if (isTrue==1) {
                        ways = (ways + (lF * rT) % MOD + (lT * rF) % MOD + (lT * rT) % MOD) % MOD;
                    } else {
                        ways = (ways + (lF * rF) % MOD) % MOD;
                    }
                } else {
                    if (isTrue==1) {
                        ways = (ways + (lF * rT) % MOD + (lT * rF) % MOD) % MOD;
                    } else {
                        ways = (ways + (lF * rF) % MOD + (lT * rT) % MOD) % MOD;
                    }
                }
            }
        }
    }

        return dp[i][j][isTrue] = (int) ways;
    }

}
