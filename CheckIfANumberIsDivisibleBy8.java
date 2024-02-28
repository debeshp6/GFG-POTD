//User function Template for Java

class Solution {
    int DivisibleByEight(String s) {
        int n = s.length();
        
        // If the number is less than 3 digits, we can directly check
        // if it's divisible by 8.
        if (n < 3) {
            int num = Integer.parseInt(s);
            if (num % 8 == 0)
                return 1;
            // For single and double digit numbers, it's not divisible by 8.
            return -1;
        }
        
        // Get the last three digits of the number.
        int num = Integer.parseInt(s.substring(n - 3));
        
        // Check if the last three digits form a number divisible by 8.
        if (num % 8 == 0)
            return 1;
        
        // If not divisible by 8, return -1.
        return -1;
    }
}
