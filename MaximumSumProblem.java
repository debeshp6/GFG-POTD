//User function Template for Java

class Solution
{
    public int maxSum(int n) 
    { 
        return sm(n);
    } 
    
    public int sm(int n) {
        int sum=0;
        if (n<2||n<3|| n<4 ) {
        return (n);   
      }
        
        sum+= (sm(n/2)+sm(n/3)+sm(n/4));
        return Math.max(sum,n);
    } 
}
