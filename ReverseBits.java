// User function Template for Java

class Solution {
    
    static Long reversedBits(Long x) {
    StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            if (((x >> i) & 1) != 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        
        Long res = 0l;
        int N = sb.length();
        
        for (int i = 0; i < N; i++) {
            if (sb.charAt(i) == '1') {
                long tmp = 31l - i;
                res = res + (1l << tmp);
            }
        }
        
        return res;
    }
};
