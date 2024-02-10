//User function Template for Java
class Solution {
    int dp[][];
    public int max_courses(int n, int total, int[] cost) {
        dp=new int[n][total+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return helper(0,n,total,cost);
    }
    public int helper(int idx,int n,int total,int cost[]){
        //System.out.println(idx+" "+total);
        if(idx==n){
            return 0;
        }
        if(dp[idx][total]!=-1){
            return dp[idx][total];
        }
        
        int max=0;
        
        int with=0;
        int without=0;
        
        if(total>=cost[idx]){
            with=1+(helper(idx+1,n,getPer(cost[idx],total),cost));
        }
        
        without=helper(idx+1,n,total,cost);
        
        //System.out.println(with+" ww "+without);
        
        return dp[idx][total]=Math.max(with,without);
    }
    public int getPer(int num,int total){
        double n=num;
        n=((0.9)*n);
        n=Math.floor(n);
        return total-num+(int)n;
    }
}
