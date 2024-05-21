class Solution {
  public:
    vector<int> printKClosest(vector<int> arr, int n, int k, int x) {
       int pos=lower_bound(arr.begin(),arr.end(),x)-arr.begin();
       int i=pos-1,j=pos;
        if(j<n && arr[pos]==x)
            j++;
       vector<int> ans;
       while(k--){
            if(j==n)
                ans.push_back(arr[i--]);
            else if(i<0)
                ans.push_back(arr[j++]);
            else{
                if(abs(arr[i]-x)<abs(arr[j]-x))
                    ans.push_back(arr[i--]);
                else
                    ans.push_back(arr[j++]);
            }
       }
       return ans;
    }
};
