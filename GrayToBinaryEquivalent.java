//User function Template for Java

class Solution {
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        int ans=n;
        while(n>0){
            ans = ans^(n>>1);
            n = n>>1;
        }
      return ans;    
    }
       
}
