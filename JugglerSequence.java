// User function Template for Java

class Solution {
    static List<Integer> jugglerSequence(int n) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(n);
        while(n != 1){
            if((n&1) == 1){
                n = (int)Math.floor(Math.pow(n, 1.5));
            }else{
                n = (int)Math.floor(Math.pow(n, 0.5));
            }
            res.add(n);
        }
        return res;
    }
}
