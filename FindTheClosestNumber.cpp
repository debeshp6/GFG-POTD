class Solution{
    public:
    int findClosest( int n, int k,int arr[]) 
    { 
        int r = lower_bound(arr,arr+n,k)-arr;
        int l = r-1;
        if(l < 0){
            return arr[r];
        } else {
            int diff1 = abs(k-arr[r]);
            int diff2 = abs(k-arr[l]);
            if(diff1 <= diff2){
                return arr[r];
            }
          return arr[l];
        }
    } 
};
