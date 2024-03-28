// User function Template for Java

class Solution {
    public boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
        for(ArrayList<Integer> i:adj){
            if(i.size()%2!=0) return false;
        }
        return true;
    }
}
