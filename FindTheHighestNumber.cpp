class Solution {
public:
    int findPeakElement(vector<int>& a) 
    {
        int i = 0,j=a.size()-1;
        int res = INT_MIN;
        while(i<=j){
            int mid = (i+j)/2;
            res = max(res,a[mid]);
            
            if(a[mid] <= a[j]){
                i = mid+1;
            }else{
                j=mid;
            }
        }
      return res;
    }
};
