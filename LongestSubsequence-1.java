class Solution {
    public static int longestSubseq(int n, int[] a) {
        int dp[]= new int[n];
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(Math.abs(a[i]-a[j])==1){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int ans=0;
        for(int u=0;u<n;u++){
            if(dp[u]>ans)ans=dp[u];
        }
        return ans+1;
    }
}
