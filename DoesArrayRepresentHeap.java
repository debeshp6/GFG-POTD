//User function Template for Java


class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        int x = 1;
        for(int i=1;i<n;i++) {
            if(i % 2 == 0) {
                if(arr[i - x - 1] < arr[i]){
                    return false;
                }
                x++;
            }
            else {
                if(arr[i-x] < arr[i]){
                    return false;
                }
            }  
        }
        return true;
    }
}
