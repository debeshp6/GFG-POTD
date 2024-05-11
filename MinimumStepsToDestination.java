// User function Template for Java

class Solution {
    static int minSteps(int d) {
        int sum = 0;
        int move = 0;
        while(sum < d || (sum - d)%2 != 0) {
            move++;
            sum = sum + move;
        }
      return move;
    }
}
