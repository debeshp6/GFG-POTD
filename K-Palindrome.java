

class Solution {
    public int kPalindrome(String str, int n, int k) {
        int dp[][] = new int[n][n];
     for(int g =0;g<str.length();g++){
         for(int i =0,j = g;j<str.length();i++,j++){
             if(g==0){
                 dp[i][j] = 1;
                 
             }
             else if(g==1)
             {
                 if(str.charAt(i) == str.charAt(j)){
                 dp[i][j] = 2;
         }
         else {
             dp[i][j] = 1;
         }
             }
         else {
             
             if(str.charAt(i)==str.charAt(j)){
                 dp[i][j] = 2+dp[i+1][j-1];
             }
             else {
                 dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
             }
         }
    }
}
        return n-dp[0][n-1]>k  ? 0 :1;
    }
}
