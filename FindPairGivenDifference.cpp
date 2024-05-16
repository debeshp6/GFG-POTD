class Solution {
  public:
    int findPair(int n, int x, vector<int> &arr) {
        sort(arr.begin(),arr.end());
        for(int i=0;i<n;i++) {
           if(binary_search(arr.begin()+i+1,arr.end(),x+arr[i]))return 1;
        }
      return -1;
    }
};
