// Complete this function!

class Geeks {
    public long count(int n) {
        
        int arr[] = new int[]{3,5,10};
        long dp[][] = new long[arr.length+1][n+1];
        for(long[] row : dp) {
			Arrays.fill(row, -1);
		}
        long ans = findWay(arr,dp,n,arr.length-1);
        return ans;
    }
    
    public static long findWay(int arr[],long dp[][],int sum,int pos){
        
        if(sum==0){
            return dp[pos][sum] = 1;
        }
        if(sum<0 || pos<0){
            return 0;
        }
        if(dp[pos][sum] != -1){
            return dp[pos][sum];
        }
        
        return dp[pos][sum] = findWay(arr,dp,sum-arr[pos],pos) 
                        + findWay(arr,dp,sum,pos-1);
    }
}
