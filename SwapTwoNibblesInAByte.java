class Solution {
    static int swapNibbles(int n) {
        int a = n % 16; 
        int b = n / 16; 
        int ans = a*16 + b; 
        return ans;
    }
}
