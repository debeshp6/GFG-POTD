class Solution {
    long max_Books(int arr[], int n, int k) {
        long res = 0;
        int s = 0, e=0;
        while(e<n){
            while(s<n && arr[s] > k) s++;
            e=s;
            long b = 0;
            while(e<n && arr[e]<=k){
                b += arr[e];
                e++;
            }
            s=e;
            res = Math.max(res, b);
        }
        return res;
    }
}
