//User function Template for Java

class Solution
{
    public static long MOD = 1000000007;
    public static long sumSubstrings(String s) {
        long n = s.length();
        long sum = 0;
        long multiplier = 1;  
        for (int i = (int) n - 1; i >= 0; i--) {
            long digit = s.charAt(i) - '0';
            sum = (sum + (digit * multiplier * (i + 1)) % MOD) % MOD;
            multiplier = (multiplier * 10 + 1) % MOD;
        }
        return sum;
    }
}
