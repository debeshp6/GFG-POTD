//User function Template for Java
class Solution{
    int solve(int num1,int num2){
        //code here
        Set<Integer> visited = new HashSet<>();
        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue the starting number
        queue.add(num1);
        // Mark the starting number as visited
        visited.add(num1);
        
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            
            // Process nodes at the current level
            for (int i = 0; i < size; i++) {
                int currentNum = queue.poll();
                
                // If we reach the target number, return the number of steps
                if (currentNum == num2) {
                    return steps;
                }
                
                // Explore neighbors by changing a single digit
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k <= 9; k++) {
                        // Skip leading zeros
                        if (j == 0 && k == 0) {
                            continue;
                        }
                        
                        // Replace the jth digit with k
                        int nextNum = replaceDigit(currentNum, j, k);
                        
                        // Check if the new number is a four-digit prime and hasn't been visited
                        if (isFourDigitPrime(nextNum) && !visited.contains(nextNum)) {
                            queue.add(nextNum);
                            visited.add(nextNum);
                        }
                    }
                }
            }
            
            // Increment the steps for each level in BFS
            steps++;
        }
        
        // If the target number is unreachable
        return -1;
    }

    // Helper function to replace a digit at a specific position
    private int replaceDigit(int num, int position, int digit) {
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        digits[position] = digit;
        return digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
    }

    // Helper function to check if a number is a four-digit prime
    private boolean isFourDigitPrime(int num) {
        if (num < 1000 || num > 9999) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
