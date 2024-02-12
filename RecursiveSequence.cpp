class Solution{
public:
    long long sequence(int n) {
        // code here
        int mod = 1e9+7;
        long long ans = 0;
        long long val = 1;
        for (int i = 1; i <= n; i++){
            long long curr = 1;
            for (int j = 1; j <= i; j++){
                curr = (curr * val)%mod;
                val++;
            }
            ans = (ans + curr)%mod;
        }
        return ans % mod;
    }
};
