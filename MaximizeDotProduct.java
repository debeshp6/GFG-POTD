//User function Template for Java

class Solution {
    public int maxDotProduct(int n, int m, int a[], int b[])  { 
        // Create a 2D array to store the results of subproblems
        Integer[][] dp = new Integer[n][m];
        
        // Call the helper function to calculate the maximum dot product recursively
        return helper(a, b, 0, 0, 0, dp);
    }

    // Recursive function to calculate the maximum dot product
    public int helper(int[] a, int[] b, int ai, int bi, int skip, Integer[][] dp) {
        // If any of the arrays reach the end, return 0 (base case)
        if (ai >= a.length || bi >= b.length) return 0;
        
        // If the result for this subproblem is already computed, return it
        if (dp[ai][bi] != null) return dp[ai][bi];
        
        // Initialize variables to store the result of taking and not taking the current element
        int take = 0, notTake = 0;
        
        // Calculate the result if we take the current elements from both arrays
        take = (a[ai] * b[bi]) + helper(a, b, ai + 1, bi + 1, skip, dp);
        
        // If there are elements remaining in array 'a' but not in array 'b', skip them
        if (skip < a.length - b.length) 
            notTake = helper(a, b, ai + 1, bi, skip + 1, dp);
        
        // Store the maximum of taking and not taking the current element in the dp array
        return dp[ai][bi] = Math.max(take, notTake);
    }
}
